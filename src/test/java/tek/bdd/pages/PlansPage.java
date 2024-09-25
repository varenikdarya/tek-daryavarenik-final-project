package tek.bdd.pages;

import org.openqa.selenium.By;

public class PlansPage {
    public static final By ROWS_LIST = By.xpath("//table/tbody/tr");
    public static final By CREATE_DATE = By.xpath("//div/table/tbody/tr[1]/td[4]");
    public static final By DATE_EXPIRE = By.xpath("//div/table/tbody/tr[1]/td[5]");
}
