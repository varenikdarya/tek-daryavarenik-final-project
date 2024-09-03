package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.ServicePage;
import tek.bdd.utility.SeleniumUtility;

import java.util.Map;

public class UserProfileSteps extends SeleniumUtility {
    @Then("user click on profile Icon")
    public void user_click_on_profile_icon() {
        clickOnElement(ServicePage.ICON_BUTTON);
    }
    @Then("validate information is in Profile Side Drawer")
    public void validate_information_is_in_profile_side_drawer(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String expectedStatus = data.get("Status");
        String expectedUserType = data.get("User Type");
        String expectedFullName = data.get("Full Name");
        String expectedUserName = data.get("UserName");
        String expectedAuthorities = data.get("Authorities");

        String actualStatus = getElementText(ServicePage.STATUS);
        String actualUserType = getElementText(ServicePage.USER_TYPE);
        String actualFullName = getElementText(ServicePage.FULL_NAME);
        String actualUserName = getElementText(ServicePage.USERNAME);
        String actualAuthorities = getElementText(ServicePage.AUTHORITIES);

        Assert.assertEquals("Both Status should match", expectedStatus,actualStatus);
        Assert.assertEquals("Both User Types should match", expectedUserType, actualUserType);
        Assert.assertEquals("Both Full names should match",  expectedFullName, actualFullName);
        Assert.assertEquals("Both User Names should match", expectedUserName, actualUserName);
        Assert.assertEquals("Both Authorities should match", expectedAuthorities, actualAuthorities);

    }

}
