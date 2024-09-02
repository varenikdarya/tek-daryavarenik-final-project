package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.CreateAccountPage;
import tek.bdd.pages.PrimaryAccountPage;
import tek.bdd.pages.SignUpAccountPage;
import tek.bdd.utility.RandomGenerator;
import tek.bdd.utility.SeleniumUtility;

import java.util.Map;

public class CreateAccountSteps extends SeleniumUtility {
    private static String emailToUse;
    private static String userNameToUse;
    private static String fullName;

    @Then("validate title {string} on the create account page")
    public void validate_title_on_the_create_account_page(String expectedTitle) {
        String actualTitle = getElementText(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_TITLE);
        Assert.assertEquals("Both title should match", expectedTitle, actualTitle);
    }

    @When("user fills out the form with valid information")
    public void user_fills_out_the_form_with_valid_information(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String email = data.get("email");
        String firstName = data.get("First Name");
        String lastName = data.get("Last Name");
        String employmentStatus = data.get("Employment Status");
        String dateOfBirth = data.get("Date Of Birth");

        emailToUse = email.equalsIgnoreCase("random")
                ? RandomGenerator.emailGenerator(firstName) : email;

        sendText(CreateAccountPage.EMAIL_INPUT, emailToUse);
        sendText(CreateAccountPage.FIRST_NAME_INPUT, firstName);
        sendText(CreateAccountPage.LAST_NAME_INPUT, lastName);
        sendText(CreateAccountPage.EMPLOYMENT_STATUS_INPUT, employmentStatus);
        sendText(CreateAccountPage.DATE_OF_BIRTH, dateOfBirth);
    }

    @When("user selects from the Title dropdown  {string}")
    public void the_user_selects_from_the_title_dropdown(String visibleText) {
        selectDropdownByVisibleText(CreateAccountPage.TITLE_DROPDOWN, visibleText);
    }

    @When("user selects from the Gender dropdown {string}")
    public void the_user_selects_from_the_gender_dropdown(String visibleText) {
        selectDropdownByVisibleText(CreateAccountPage.GENDER_DROPDOWN, visibleText);
    }

    @When("user selects  from the Marital Status dropdown {string}")
    public void the_user_selects_from_the_marital_status_dropdown(String visibleText) {
        selectDropdownByVisibleText(CreateAccountPage.MARITIAL_STATUS_DROPDOWN, visibleText);

    }

    @Then("the user should be navigated to the {string} page")
    public void the_user_should_be_navigated_to_the_page(String expectedTitle) {
        String actualTitle = getElementText(SignUpAccountPage.SIGN_UP_ACCOUNT_TITLE);
        Assert.assertEquals("Both titles should match", expectedTitle, actualTitle);
    }

    @Then("the proper email address should be displayed")
    public void the_proper_email_address_should_be_displayed() {
        String actualEmail = getElementText(SignUpAccountPage.SIGN_UP_EMAIL);
        Assert.assertEquals("Both email should match", emailToUse, actualEmail);
    }

    @When("user fills out the form with valid information and existing email")
    public void user_fills_out_the_form_with_valid_information_and_existing_email(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String email = data.get("email");
        String firstName = data.get("First Name");
        String lastName = data.get("Last Name");
        String employmentStatus = data.get("Employment Status");
        String dateOfBirth = data.get("Date Of Birth");
        fullName = firstName + " " + lastName;

        sendText(CreateAccountPage.EMAIL_INPUT, email);
        sendText(CreateAccountPage.FIRST_NAME_INPUT, firstName);
        sendText(CreateAccountPage.LAST_NAME_INPUT, lastName);
        sendText(CreateAccountPage.EMPLOYMENT_STATUS_INPUT, employmentStatus);
        sendText(CreateAccountPage.DATE_OF_BIRTH, dateOfBirth);
    }
    @Then("user fills out the Sign up account")
    public void user_fills_out_the_sign_up_account(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String userName = data.get("Username");
        String password = data.get("Password");
        String confirmPassword = data.get("Confirm Password");

        userNameToUse = userName.equalsIgnoreCase("random")
                ? RandomGenerator.userNameGenerator(fullName) : userName;

        sendText(SignUpAccountPage.USERNAME_INPUT, userNameToUse);
        sendText(SignUpAccountPage.PASSWORD_INPUT, password);
        sendText(SignUpAccountPage.CONFIRM_PASSWORD_INPUT, password);
    }
    @Then("then user sign in with valid username and password")
    public void then_user_sign_in_with_valid_username_and_password() {
        sendText(SignUpAccountPage.USERNAME_INPUT,userNameToUse);
        sendText(SignUpAccountPage.PASSWORD_INPUT,"Password@123");
    }
    @Then("user should navigated to {string} page")
    public void user_should_navigated_to(String expectedTitle) {
        String actualTitle = getElementText(PrimaryAccountPage.PRIMARY_ACCOUNT_PORTAL_TITLE);
        Assert.assertEquals("Both title should match", expectedTitle, actualTitle);
    }
    @Then("user click on profile Icon and Full Name should display at Profile Section")
    public void user_clicking_on_profile_icon_and_full_name_should_display_at_profile_section() {
    clickOnElement(PrimaryAccountPage.ICON_BUTTON);
    String actualFullName = getElementText(PrimaryAccountPage.FULL_NAME);
    Assert.assertEquals("Both Full Name should match",fullName, actualFullName);
    }
    }
