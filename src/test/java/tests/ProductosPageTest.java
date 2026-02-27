package tests;

import PageObjects.CarritoDeComprasPage;
import PageObjects.LoginPage;
import PageObjects.ProductosPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductosPageTest extends BaseWebTest {
    @Test
    public void agregarPrimerItemAlCarrito(){

        String usuario ="standard_user";
        String password = "secret_sauce";

        LoginPage loginPage = new LoginPage();
        loginPage.login(usuario,password);

        ProductosPage productosPage = new ProductosPage();
        String nombrePrimerItem = productosPage.getNombreDelPrimerProducto();
        productosPage.agregarPrimerProducto();
        productosPage.irAlCarritoDeCompras();
        CarritoDeComprasPage carritoDeComprasPage = new CarritoDeComprasPage();
        String primerProductoEnCarrito = carritoDeComprasPage.getPrimerProductoEnCarrito();

        assertThat(primerProductoEnCarrito).isEqualTo(nombrePrimerItem);
    }

    @Test
    public void OrdenamientoPrecioMayoraMenorTest(){
        String usuario ="standard_user";
        String password = "secret_sauce";

        LoginPage loginPage = new LoginPage();
        loginPage.login(usuario,password);

        ProductosPage productosPage = new ProductosPage();
        productosPage.ordenarPorPrecioMayoraMenor();
        List<WebElement> precios = productosPage.getPrecios();
        int ultimoIndice= precios.size() - 1;

        Double primerPrecio = Double.parseDouble(precios.get(0).getText().substring(1));
        Double ultimoPrecio = Double.parseDouble(precios.get(ultimoIndice).getText().substring(1));
        assertThat(primerPrecio).isGreaterThan(ultimoPrecio);
    }
}
