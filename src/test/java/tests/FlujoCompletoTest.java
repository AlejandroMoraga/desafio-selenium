package tests;

import PageObjects.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FlujoCompletoTest extends BaseWebTest{
    @Test
    public void completarFlujoTest(){
        String usuario ="standard_user";
        String password = "secret_sauce";
        String mensajeEsperado ="Thank you for your order!";

        LoginPage loginPage = new LoginPage();
        loginPage.login(usuario,password);

        ProductosPage productosPage = new ProductosPage();
        productosPage.agregarPrimerProducto();
        productosPage.irAlCarritoDeCompras();
        CarritoDeComprasPage carritoDeComprasPage = new CarritoDeComprasPage();
        carritoDeComprasPage.hacerCheckout();

        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.llenarFormulario();
        checkoutPage.continuar();

        ResumenPedidoPage resumenPedidoPage = new ResumenPedidoPage();
        resumenPedidoPage.finalizar();

        ConfirmacionPage confirmacionPage = new ConfirmacionPage();
        String mensajeObtenido = confirmacionPage.getMensajeAgradecimiento();

        assertThat(mensajeObtenido).isEqualTo(mensajeEsperado);
    }
}
