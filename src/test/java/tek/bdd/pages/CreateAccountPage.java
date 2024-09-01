package tek.bdd.pages;

import org.openqa.selenium.By;

public class CreateAccountPage {
    public static final By CREATE_PRIMARY_ACCOUNT_TITLE = By.xpath("//h2[text() ='Create Primary Account Holder']");
    public static final By EMAIL_INPUT = By.xpath("//input[@id='email']");
    public static final By FIRST_NAME_INPUT = By.xpath("//input[@id='firstName']");
    public static final By LAST_NAME_INPUT = By.xpath("//input[@id='lastName']");
    public static final By EMPLOYMENT_STATUS_INPUT = By.xpath("//input[@id='employmentStatus']");
    public static final By DATE_OF_BIRTH = By.xpath("//input[@id='dateOfBirth']");
    public static final By GENDER_DROPDOWN = By.xpath("//select[@id='gender']");
    public static final By TITLE_DROPDOWN = By.xpath("//select[@id='title']");
    public static final By MARITIAL_STATUS_DROPDOWN = By.xpath("//select[@id='maritalStatus']");




}

