package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import tests.BaseTest;

/**
 * Created by sargis.sargsyan on 9/16/16
 */
public class DriverHelper {

    static WebDriver driver;

    public static WebDriver getDriver() {
        driver = BaseTest.driver;
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
