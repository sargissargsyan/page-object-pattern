package pages;

import helpers.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by sargis.sargsyan on 9/14/16
 */
public class QuestionsPage extends BasePage {
    public QuestionsPage() {
        this.get();
    }
     By usersTabLocator = By.id("nav-users");

    public Boolean isUsersTabDisplayed() {
        List<WebElement> usersTab = driver.findElements(usersTabLocator);
        return usersTab.size() > 0;
    }


    @Override
    public String getPageUrl() {
        return "questions/";
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        WaitHelper.isLoaded().isElementIsVisible(By.cssSelector("#h-all-questions"));
    }
}
