@regression
Feature:As a user, I should be able to update settings
  Background:Verify login with valid credentials
    Given the user is on the login page
    When user use username and passcode
    And user click the login button

  Scenario: Verify the users can check any checkbox on the Files page.
    Given User on the dashboard page
    When the user clicks the "Files" module
    And user clicks Settings on the left bottom corner
    Then the user should be able to click any checkbox
