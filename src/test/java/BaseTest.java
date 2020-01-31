import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public WebDriver driver;
    private static BaseTest driverInit = null;

    public static BaseTest getInstance() {
        if (driverInit == null) {
            driverInit = new BaseTest();
        }
        return driverInit;
    }

    private BaseTest() {
        this.driver = new FirefoxDriver();
        this.driver.get("https://google.com");
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
