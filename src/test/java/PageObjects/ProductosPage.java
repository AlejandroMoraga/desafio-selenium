package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.driver.DriverManager;

import java.util.List;

public class ProductosPage extends BaseWebPage{
    private By titulo = By.cssSelector("#header_container span.title");
    private By ListadoDeItems = By.cssSelector(".inventory_list");
    private By botonPrimerItem = By.xpath("(//div[@class='inventory_list']//button)[1]");
    private By linkCarritoDeCompras = By.cssSelector("a.shopping_cart_link");
    private By nombrePrimerItem = By.xpath("(//div[@class='inventory_item_name '])[1]");
    private By dropDownOrdenamiento = By.xpath("//select[@data-test='product-sort-container']");
    private By divPrecio = By.cssSelector(".inventory_item_price");

    public String encontrarTitulo(){
        return DriverManager.getDriver().findElement(titulo).getText();
    }

    public List<WebElement> getPrecios(){
        esperarPorElemento(divPrecio);
        return DriverManager.getDriver().findElements(divPrecio);
    }

    public void agregarPrimerProducto(){
        clickEnElementoBy(botonPrimerItem);
    }

    public void irAlCarritoDeCompras(){
        clickEnElementoBy(linkCarritoDeCompras);
    }

    public String getNombreDelPrimerProducto(){
        return DriverManager.getDriver().findElement(nombrePrimerItem).getText();
    }

    public void ordenarPorPrecioMayoraMenor(){
        esperarPorElemento(dropDownOrdenamiento);
        Select opcionesOrdenamiento = new Select(DriverManager.getDriver().findElement(dropDownOrdenamiento));
        opcionesOrdenamiento.selectByIndex(3);

    }

    public By getTituloLocator() {
        return titulo;
    }

    public By getTitulo() {
        return titulo;
    }

    public By getListadoDeItems() {
        return ListadoDeItems;
    }
}
