@AccountsFeature @Regression
Feature: Accounts feature

  Background: Navigate to login page
    When user click on a link text button "Login"
    Then user login with username "supervisor" and password "tek_supervisor"
    Then user click on "Sign In" button
    Then user click on a link text button "Accounts"

  @AccountScenario1
  Scenario: Navigate to Customer Service Portal with valid CSR credentials and validate 5 row of data is present on Accounts Page
    Then validate 5 rows of data is present

  @AccountScenario2
  Scenario Outline: Navigate to Customer Service Portal with valid CSR credentials and validate table records when change show per page to 10, 25, 50
    When user change Show per page to "<value>"
    Then validate <validation value> rows of data is present
    Examples:
      | value | validation value |
      | 10    | 10               |
      | 25    | 25               |
      | 50    | 50               |