package tek.bdd.pages;

import org.openqa.selenium.By;

public class ServicePage {
    public static final By CUSTOMER_SERVICE_TITLE_TEXT = By.xpath("//div[contains(@class,'header')]/a/following-sibling::h2");
    public static final By ICON_BUTTON = By.xpath("//button[@class='chakra-button chakra-button css-1lzp9bh']");
    public static final By STATUS = By.xpath("//p[text() = 'STATUS']/following-sibling::p");
    public static final By USER_TYPE = By.xpath("//p[text() = 'USER TYPE']/following-sibling::p");
    public static final By FULL_NAME = By.xpath("//p[text() = 'FULL NAME']/following-sibling::p");
    public static final By USERNAME = By.xpath("//p[text() = 'USERNAME']/following-sibling::p");
    public static final By AUTHORITIES = By.xpath("//p[text() = 'AUTHORITIES']/following-sibling::ul");
}
