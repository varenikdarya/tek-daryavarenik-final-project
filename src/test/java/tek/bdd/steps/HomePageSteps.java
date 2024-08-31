package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.HomePage;
import tek.bdd.utility.SeleniumUtility;

public class HomePageSteps extends SeleniumUtility {
    @Then("validate the home page title is {string}")
    public void validate_the_home_page_title_is(String expectedTitle) {
        String actualTitle = getTitleElement();
        Assert.assertEquals("Both result should be match", expectedTitle, actualTitle);
    }

    @Then("Create Primary Account Button is exist")
    public void create_primary_account_button_is_exist() {
        boolean buttonIsEnable = isElementEnabled(HomePage.CREATE_PRIMARY_ACCOUNT_BUTTON);
        Assert.assertTrue(buttonIsEnable);
    }
}