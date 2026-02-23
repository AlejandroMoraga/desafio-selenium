package PageObjects;

import org.openqa.selenium.By;

public class ResumenPedidoPage extends BaseWebPage{
    private By botonFinish = By.id("finish");

    public void finalizar(){
        clickEnElementoBy(botonFinish);
    }
}
