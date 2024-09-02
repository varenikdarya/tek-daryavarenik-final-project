package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.ServicePage;
import tek.bdd.pages.SignUpAccountPage;
import tek.bdd.utility.SeleniumUtility;

public class LoginSteps extends SeleniumUtility  {
    @When("user login with username {string} and password {string}")
    public void user_login_with_username_and_password(String username, String password) {
        sendText(SignUpAccountPage.USERNAME_INPUT, username);
        sendText(SignUpAccountPage.PASSWORD_INPUT, password);
    }
    @Then("validate user is navigated to {string}")
    public void validate_user_is_navigated_to(String expectedTitle) {
       String actualTitle = getElementText(ServicePage.CUSTOMER_SERVICE_TITLE_TEXT);
       Assert.assertEquals("Both title should match", expectedTitle, actualTitle);
    }
    }

