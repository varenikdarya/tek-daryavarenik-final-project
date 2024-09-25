package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.bdd.pages.AccountsPage;
import tek.bdd.utility.SeleniumUtility;

public class AccountsSteps extends SeleniumUtility {

    @When("user change Show per page to {string}")
    public void user_change_show_per_page_to(String value) {
        selectFromDropDownByValue(AccountsPage.PAGE_DROPDOWN, value);
    }

    }
