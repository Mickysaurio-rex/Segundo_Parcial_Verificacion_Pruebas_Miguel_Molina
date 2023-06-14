package ejercicio3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testBase.TestBase;

import java.util.Date;

public class Ejercicio3test extends TestBase {
    @Test
    public void verifyCrudTestProject() {
        mainPage.loginButton.click();

        loginSection.emailTxtBox.setText("miguel_segundo_examen@upb.com");
        loginSection.pwdTxtBox.setText("12345");
        loginSection.loginButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR!! login was not successfully, review credentials");
        //create
        String name = "miguel" + new Date().getTime();
        barProjects.addNewProject.click();
        barProjects.barNameProject.setText(name);
        barProjects.addButton.click();
        barProjects.setDivProjectName(name);

        Assertions.assertTrue(barProjects.divProjectName.isControlDisplayed(),
                "ERROR!! Project was not created");

    }
}
