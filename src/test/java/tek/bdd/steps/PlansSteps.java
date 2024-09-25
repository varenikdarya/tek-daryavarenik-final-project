package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.PlansPage;
import tek.bdd.utility.SeleniumUtility;


import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class PlansSteps extends SeleniumUtility {
    @Then("validate {int} rows of data is present")
    public void validate_rows_of_data_is_present(int expectedNumbersOfRows) {
        List<WebElement> allPlans = getElements(PlansPage.ROWS_LIST);
        int actualNumberOfRow = allPlans.size();
        Assert.assertEquals("Both value should match", expectedNumbersOfRows, actualNumberOfRow);

    }

    @Then("validate create date is today date and date expire is a day after in EST Time Zone")
    public void validate_create_date_is_today_date_and_date_expire_is_a_day_after_in_est_time_zone() {
        String displayedCreateDate = getElementText(PlansPage.CREATE_DATE);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String actualDate = LocalDate.now(ZoneId.of("America/New_York")).format(dateFormatter);
        Assert.assertEquals("Both date should match", actualDate, displayedCreateDate);
    }


    @Then("validate date expire is a one day after current date in EST Time Zone")
    public void validate_date_expire_is_a_one_day_after_current_date_in_est_time_zone() {
            String displayedExpireDate = getElementText(PlansPage.DATE_EXPIRE);
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
            String actualExpireDate = LocalDate.now(ZoneId.of("America/New_York")).plusDays(1).format(dateFormatter);
            Assert.assertEquals("Both date should match", actualExpireDate, displayedExpireDate);
    }
    }

