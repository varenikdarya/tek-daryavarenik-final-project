@UserProfileFeature
Feature:User Profile feature

  Background: Navigate to login page
    When user click on a link text button "Login"
    When user login with username "supervisor" and password "tek_supervisor"
    Then user click on "Sign In" button
    Then user click on profile Icon

  @UserProfileScenario1
  Scenario: Validate information on Profile Side Drawer
    Then wait for 5 seconds
    Then validate information is in Profile Side Drawer
      | Status      | Active        |
      | User Type   | CSR        |
      | Full Name   | Supervisor |
      | UserName    | supervisor |
      | Authorities | admin      |

  @UserProfileScenario2
  Scenario: Validate user after log out navigate to home page
    Then user click on "Logout" button
    Then validate the home page title is "Tek Insurance UI"