package PageObjects;

import org.openqa.selenium.By;
import utils.driver.DriverManager;

public class LoginPage extends BaseWebPage{
    private By inputUserName = By.id("user-name");
    private By inputPassword = By.id("password");
    private By buttonLogin = By.id("login-button");
    private By mensajeDeError = By.xpath("//h3[@data-test='error']");

    public void login(String usuario, String password){
        type(inputUserName,usuario);
        type(inputPassword,password);
        clickEnElementoBy(buttonLogin);
    }

    public String getMensajeDeError(){
        esperarPorElemento(mensajeDeError);
        return DriverManager.getDriver().findElement(mensajeDeError).getText();
    }
}
