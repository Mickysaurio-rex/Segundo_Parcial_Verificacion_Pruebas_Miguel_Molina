package ejercicio4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testBase.TestBaseTodoIst;

public class Ejercicio4test extends TestBaseTodoIst {
    @Test
    public void verifyChangePasswordSuccessfully() throws InterruptedException{
        mainPage.iniciarSesionButton.click();

        loginSection.emailBox.setText("miguel_segundo_examen@upb.com");
        loginSection.pwdBox.setText("Verificacion123");
        loginSection.startEmailButton.click();

        Thread.sleep(4000);

        Assertions.assertTrue(menuSection.menuPerfilButton.isControlDisplayed(),
                "ERROR!! login was not successfully, review credentials");

        menuSection.menuPerfilButton.click();
        menuSection.configurationButton.click();
        menuConfiguration.changePswButton.click();
        menuConfiguration.actualPswBox.setText("miguel123@upb.com");
        menuConfiguration.newPswBox.setText("Verificacion456");
        menuConfiguration.newPswBoxConfirm.setText("Verificacion456");
        menuConfiguration.savePasswordButton.click();
        menuConfiguration.closeMenuConfiguration.click();
        menuSection.menuPerfilButton.click();
        menuSection.logoutButton.click();

        Thread.sleep(4000);

        mainPage.iniciarSesionButton.click();
        loginSection.emailBox.setText("miguel_segundo_examen@upb.com");
        loginSection.pwdBox.setText("Verificacion456");
        loginSection.startEmailButton.click();
        Assertions.assertTrue(menuSection.menuPerfilButton.isControlDisplayed(),
                "ERROR!! login was not successfully, review credentials");




    }
}
