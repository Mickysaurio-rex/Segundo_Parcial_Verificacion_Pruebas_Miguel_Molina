package pages.todoIst;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class MenuConfiguration {
    public Button changePswButton = new Button(By.xpath("//a[@href=\"/app/settings/account/password\"]"));
    public TextBox actualPswBox = new TextBox(By.id("element-28"));
    public TextBox newPswBox = new TextBox(By.id("element-31"));
    public TextBox newPswBoxConfirm = new TextBox(By.id("element-34"));
    public Button savePasswordButton = new Button(By.xpath("//button[@type=\"submit\"]"));
    public Button closeMenuConfiguration = new Button(By.xpath("//button[@aria-label=\"Cerrar configuración\"]"));

}
