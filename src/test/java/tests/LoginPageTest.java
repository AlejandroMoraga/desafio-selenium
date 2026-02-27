package tests;

import PageObjects.LoginPage;
import PageObjects.ProductosPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginPageTest extends BaseWebTest {
    @Test
    public void loginExitosoTest(){
        String usuario ="standard_user";
        String password = "secret_sauce";
        String tituloEsperado = "Products";

        LoginPage loginPage = new LoginPage();
        loginPage.login(usuario,password);

        ProductosPage productosPage = new ProductosPage();
        wait.until(ExpectedConditions.visibilityOfElementLocated(productosPage.getTitulo()));

        String tituloDelaPagina = productosPage.encontrarTitulo();
        assertThat(tituloDelaPagina).isEqualTo(tituloEsperado);
    }

    @Test
    public void loginInvalidoTest(){
        String usuario ="locked_out_user";
        String password = "secret_sauce";
        String mensajeEsperado ="Epic sadface: Sorry, this user has been locked out.";

        /*
        Navigate navigate = new Navigate();
        navigate.navigateToLoginPage();
*/
        LoginPage loginPage = new LoginPage();
        loginPage.login(usuario,password);
        String mensajeObtenido = loginPage.getMensajeDeError();

        assertThat(mensajeEsperado).isEqualTo(mensajeObtenido);
    }
}
