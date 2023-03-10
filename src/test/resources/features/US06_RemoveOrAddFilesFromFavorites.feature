@regression
Feature: As a user, I should be able to remove files from favorites

  Background:Verify login with valid credentials
    Given the user is on the login page
    When user use username and passcode
    And user click the login button


  Scenario: verify users to remove files to Favorites
    Given User on the dashboard page
    When the user clicks the "Files" module
    When the users click action-icon from any file on the page to remove
    And  User choose the "Remove from favorites" option
    And user click the "Favorites" sub-module on the left side
    Then Verify that the file is not listed in the Favorites table
