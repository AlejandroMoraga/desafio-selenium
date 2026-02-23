package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driver.DriverManager;

import java.time.Duration;

public class BaseWebTest {
    protected WebDriverWait wait;
    private static String DEFAULT_BROWSER = "chrome";

    @BeforeEach
    public void setUp() {

        DriverManager.initDriver();

        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
        DriverManager.getDriver().get("https://www.saucedemo.com/");

    }

    @AfterEach
    public void tearDown(){
        DriverManager.quit();
    }
}
