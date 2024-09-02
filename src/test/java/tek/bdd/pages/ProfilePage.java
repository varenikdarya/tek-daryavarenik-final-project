package tek.bdd.pages;

import org.openqa.selenium.By;

public class ProfilePage {
    public static final By CUSTOMER_PORTAL_TITLE = By.xpath("//h2[text() ='Customer Service Portal']");
    public static final By ICON_BUTTON = By.xpath("//button[@class='chakra-button chakra-button css-1lzp9bh']");
    public static final By FULL_NAME = By.xpath("//p[text() = 'FULL NAME']/following-sibling::p");
}
