package pages;

import helpers.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by sargis.sargsyan on 9/14/16
 */
public class HomePage extends BasePage {

    By menuBarLocator = By.cssSelector("div#hmenus");
    By questionsTabLocator = By.cssSelector("#nav-questions");

    public HomePage() {
        this.get();
    }

    public QuestionsPage clickQuestionsTab() {
        WebElement questionsTab = driver.findElement(questionsTabLocator);
        questionsTab.click();
        return new QuestionsPage();
    }

    public Boolean isQuestionsTabDisplayed() {
        List<WebElement> questionsTab = driver.findElements(questionsTabLocator);
        return questionsTab.size() > 0;
    }

    @Override
    public String getPageUrl() {
        return "/questions";
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        WaitHelper.isLoaded().isElementIsVisible(questionsTabLocator);
        WaitHelper.isLoaded().isElementIsClickable(questionsTabLocator);
    }
}
