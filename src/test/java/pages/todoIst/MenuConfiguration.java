package pages.todoIst;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class MenuConfiguration {
    public Button changePswButton = new Button(By.xpath("//a[@href=\"/app/settings/account/password\"]"));
    public TextBox actualPswBox = new TextBox(By.xpath("//div[@class=\"_6c84b26d _2a3b75a1 _509a57b4 e5a9206f _50ba6b6b\"]//input[@autocomplete=\"off\"]"));
    public TextBox newPswBox = new TextBox(By.id("element-31"));
    public TextBox newPswBoxConfirm = new TextBox(By.id("element-34"));
    public Button savePasswordButton = new Button(By.xpath("//button[@type=\"submit\"]"));
    public Button closeMenuConfiguration = new Button(By.xpath("//button[@aria-label=\"Cerrar configuración\"]"));

}
