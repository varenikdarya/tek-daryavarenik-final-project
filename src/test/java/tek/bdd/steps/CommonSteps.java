package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import tek.bdd.pages.CreateAccountPage;
import tek.bdd.pages.HomePage;
import tek.bdd.utility.SeleniumUtility;

public class CommonSteps extends SeleniumUtility {
    @Given("user click on {string} link")
    public void userClickOnLinks(String linkText) {
        clickOnElement(By.linkText(linkText));
    }


    @When("user click on {string} button")
    public void user_click_on_button(String buttonVisibleText) {
        try {
            String buttonXpath = "//button[text()='" + buttonVisibleText + "']";
            clickOnElement(By.xpath(buttonXpath));
        } catch (TimeoutException ex) {
            String buttonXpath = "//*[text()='" + buttonVisibleText + "']/..";
        }

    }

    @When("user enter {string} on {string} field")
    public void userEnterTextToAnyField(String text, String fieldName) {
        String xpath = " //label[text()='" + fieldName + "']/..//input";
        sendText(By.xpath(xpath), text);
    }

    @When("wait for {} seconds")
    public void waitForSeconds(Integer seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    @When("user click on a link text button {string}")
    public void clickOnButtonByLinkText(String text) {
        clickOnElement(By.linkText(text));
    }

    @Then("error message should be appear {string}")
    public void error_message_should_be_appear(String expectedErrorMessage) {
        String actualErrorMessage = getElementText(CreateAccountPage.ERROR_MESSAGE)
                .replace("ERROR", "").trim();;
        Assert.assertEquals("Both message should be the same: ", expectedErrorMessage, actualErrorMessage);
    }
    @Then("user wait for {int} second")
    public void userWaitForSecond(Integer sec) {
        try {
            Thread.sleep(sec * 1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}