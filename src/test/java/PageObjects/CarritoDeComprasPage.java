package PageObjects;

import org.openqa.selenium.By;
import utils.driver.DriverManager;

public class CarritoDeComprasPage extends BaseWebPage {
    private By primerElementoEnLaLista = By.xpath("//div[@id='cart_contents_container']//div[@class='cart_item'][1]//a");
    private By botonCheckout = By.id("checkout");

    public String getPrimerProductoEnCarrito(){
        esperarPorElemento(primerElementoEnLaLista);
        return DriverManager.getDriver().findElement(primerElementoEnLaLista).getText();
    }

    public void hacerCheckout(){
        clickEnElementoBy(botonCheckout);
    }
}
