@zeynure
Feature: As a user, I should be able to access to Files module - Favorites button

  Background:Verify login with valid credentials
    Given the user is on the login page
    When user use username and passcode
    And user click the login button

  Scenario: Verify users to add files to Favorites

    Given user click on the "Dashboard" page
    When the user clicks the "Files" module
    When the user clicks action-icon from any file on the page
    And user choose the "Add to favorites" option
    And user click the "Favorites" sub-module on the left side
    Then Verify the chosen file is listed on the table