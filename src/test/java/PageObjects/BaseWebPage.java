package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driver.DriverManager;

import java.time.Duration;

public class BaseWebPage {
    protected WebDriverWait wait;

    public void esperarPorElemento(By by){
        wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void type(By by, String text){
        esperarPorElemento(by);
        DriverManager.getDriver().findElement(by).sendKeys(text);
    }

    public void clickEnElementoBy(By by){
        esperarPorElemento(by);
        DriverManager.getDriver().findElement(by).click();
    }

    public void clickEnElemento(WebElement webElement){
        webElement.click();
    }
}
