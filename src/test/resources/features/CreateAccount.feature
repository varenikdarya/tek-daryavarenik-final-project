@Smoke
Feature: Create Account
  Background: User click on Create Primary Account button
    Given user click on a link text button "Create Primary Account"

  @CreateAccountScenario1
  Scenario: Navigate to Create Account Form page and Validate title "Create Primary Account Holder"
    Then validate title "Create Primary Account Holder" on the create account page

  @CreateAccountScenario2
  Scenario: Fill up the Create Account Form and validate Sign up page and email address
    When user fills out the form with valid information
      | email              | random     |
      | First Name         | John       |
      | Last Name          | Adams      |
      | Employment Status  | Engineer   |
      | Date Of Birth      | 10/20/1980 |
    And user selects from the Title dropdown  "Mr."
    And user selects from the Gender dropdown "Male"
    And user selects  from the Marital Status dropdown "Married"
    Then user click on "Create Account" button
    Then the user should be navigated to the "Sign up your account" page
    Then the proper email address should be displayed

  @CreateAccountScenario3
  Scenario: Create account with existing email address and validate error message as expected
    When user fills out the form with valid information and existing email
      | email              | John2012@gmail.com |
      | First Name         | John               |
      | Last Name          | Adams              |
      | Employment Status  | Engineer           |
      | Date Of Birth      | 10/20/1980         |
    And user selects from the Title dropdown  "Mr."
    And user selects from the Gender dropdown "Male"
    And user selects  from the Marital Status dropdown "Married"
    Then user click on "Create Account" button
    Then error message should be appear "Account with email John2012@gmail.com is exist"

  @CreateAccountScenario4
  Scenario: Create Account with Age less that 18 Years Old and validate error
    When user fills out the form with valid information and existing email
      | email              | John2012@gmail.com |
      | First Name         | John               |
      | Last Name          | Adams              |
      | Employment Status  | Engineer           |
      | Date Of Birth      | 10/20/2010         |
    And user selects from the Title dropdown  "Mr."
    And user selects from the Gender dropdown "Male"
    And user selects  from the Marital Status dropdown "Single"
    Then user click on "Create Account" button
    Then error message should be appear "you must be 18 years or older to create account"

  @CreateAccountScenario5
  Scenario: Scenario 5
    When user fills out the form with valid information
      | email              | random     |
      | First Name         | John       |
      | Last Name          | Adams      |
      | Employment Status  | Engineer   |
      | Date Of Birth      | 10/20/1980 |
    And user selects from the Title dropdown  "Mr."
    And user selects from the Gender dropdown "Male"
    And user selects  from the Marital Status dropdown "Married"
    Then user click on "Create Account" button
    Then user fills out the Sign up account
      | Username           | random         |
      | Password           | Password@123   |
      | Confirm Password   | Password@123   |
    When user click on "Submit" button
    Then wait for 5 seconds
    Then then user sign in with valid username and password
    When user click on "Sign In" button
    Then user should navigated to "Primary Account Portal" page
    Then user click on profile Icon and Full Name should display at Profile Section

