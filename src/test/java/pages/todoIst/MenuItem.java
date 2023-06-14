package pages.todoIst;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class MenuItem {
    public Button createItemButton = new Button(By.xpath("//button[@class=\"plus_add_button\"]"));
    public TextBox nameItemBox = new TextBox(By.xpath("//div[@aria-label=\"Nombre de la tarea\"]//p[@class=\"is-empty is-editor-empty\"]"));


}
