@PlansFeature
Feature: Plans features

  Background: Navigate to login page
    When user click on a link text button "Login"
    Then user login with username "supervisor" and password "tek_supervisor"
    Then user click on "Sign In" button
    Then user click on a link text button "Plans"

  @PlansScenario1
  Scenario: Navigate to Customer Service Portal with valid CSR credentials and validate 4 row of data is present on Plans Page
    Then validate 4 rows of data is present

  @PlansScenario2
  Scenario: Navigate to Customer Service Portal with valid CSR credentials and validate create date and date expire
    Then validate create date is today date and date expire is a day after in EST Time Zone
    Then validate date expire is a one day after current date in EST Time Zone