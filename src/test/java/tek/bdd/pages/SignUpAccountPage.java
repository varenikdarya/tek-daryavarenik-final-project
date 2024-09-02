package tek.bdd.pages;

import org.openqa.selenium.By;

public class SignUpAccountPage {
    public static final By SIGN_UP_ACCOUNT_TITLE =  By.xpath("//h2[text()='Sign up your account']");
    public static final By SIGN_UP_EMAIL = By.xpath("//div[@class='chakra-stack css-1pqwvz2']//child::h2[3]");
    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By CONFIRM_PASSWORD_INPUT = By.id("confirm");

}
