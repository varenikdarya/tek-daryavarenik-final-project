@LoginFeature
Feature: Login feature

  Background: Navigate to login page
    When user click on a link text button "Login"

  @LoginScenario1
  Scenario: Sign in with valid credential
    When user login with username "supervisor" and password "tek_supervisor"
    Then user click on "Sign In" button
    Then validate user is navigated to "Customer Service Portal"

  @LoginScenario2
  Scenario Outline: Sign in with invalid credential
    When user login with username "<username>" and password "<password>"
    Then user click on "Sign In" button
    Then error message should be appear "<expectedResult>"

    Examples:
      | username        | password        | expectedResult                 |
      | invalidUserName | tek_supervisor  | User invalidUserName not found |
      | supervisor      | wrongPassword   | Password not matched          |
