package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.QuestionsPage;

/**
 * Created by sargis.sargsyan on 9/14/16
 */
public class QuestionsTest extends BaseTest {

    @Test(groups = {"group1"})
    public void clickQuestionsTest() {
        HomePage homePage = new HomePage();
        QuestionsPage questionsPage = homePage.clickQuestionsTab();
        Assert.assertTrue(questionsPage.isUsersTabDisplayed());
    }

    @Test(groups = {"group2"})
    public void isLogoDisplayedTest() {
        HomePage landingPage = new HomePage();
        Assert.assertTrue(landingPage.isQuestionsTabDisplayed());
    }
}
