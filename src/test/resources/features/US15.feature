@regression
Feature: As a user, I should be able to access to Contacts module.

  Background:Verify login with valid credentials
    Given the user is on the login page
    When user use username and passcode
    And user click the login button

    Scenario: verify user access to the contacts module
    Given users on the dashboard page
    When the user click the "Contacts" module
    Then verify the page title is "Contacts - Trycloud QA"

