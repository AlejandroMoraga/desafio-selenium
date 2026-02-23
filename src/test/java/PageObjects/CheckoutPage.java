package PageObjects;

import org.openqa.selenium.By;

public class CheckoutPage extends BaseWebPage{
    private By primerNombre = By.id("first-name");
    private By apellido = By.id("last-name");
    private By codigoPostal = By.id("postal-code");
    private By botonContinue = By.id("continue");
    private By formularioCheckout = By.cssSelector("#checkout_info_container form");

    public void llenarFormulario(){
        esperarPorElemento(formularioCheckout);
        type(primerNombre,"Juan");
        type(apellido,"Perez");
        type(codigoPostal,"555555");
    }

    public void continuar(){
        clickEnElementoBy(botonContinue);
    }
}
