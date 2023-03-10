@regression
Feature: As a user, I should be able to access to Files module.

  Background:Verify login with valid credentials
    Given the user is on the login page
    When user use username and passcode
    And user click the login button
  Scenario: verify users can access to Files module
    Given User on the dashboard page
    When the user clicks the "Files" module
    Then verify the page title is "Files - Trycloud QA.”


  @Files
  Scenario: verify users can select all the uploaded files from the page
    Given User on the dashboard page
    When the user clicks the "Files" module
    And user click the top-left checkbox of the table
    Then verify all the files are selected
