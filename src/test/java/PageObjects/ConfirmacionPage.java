package PageObjects;

import org.openqa.selenium.By;
import utils.driver.DriverManager;

public class ConfirmacionPage extends BaseWebPage{
    private By mensajeAgradecimiento = By.cssSelector(".complete-header");

    public String getMensajeAgradecimiento(){
        return DriverManager.getDriver().findElement(mensajeAgradecimiento).getText();
    }
}
