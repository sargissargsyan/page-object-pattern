package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.DriverHelper.getDriver;
import static tests.BaseTest.getWebServer;

/**
 * Created by sargis.sargsyan on 9/14/16
 */
public abstract class BasePage<T> {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        this.driver = getDriver();
        this.wait = (new WebDriverWait(driver, 30));
    }

    public T openPage(Class<T> clazz) {
        T page = PageFactory.initElements(getDriver(), clazz);
        getDriver().get(getWebServer() + getPageUrl());
        return page;
    }

    public abstract String getPageUrl();

}
