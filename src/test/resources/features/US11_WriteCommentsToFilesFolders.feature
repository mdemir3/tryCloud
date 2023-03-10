@tamara
Feature: As a user, I should be able to write comments to files/folders.

  Background:Verify login with valid credentials
    Given the user is on the login page
    When user use username and passcode
    And user click the login button

  Scenario: Verify users to write comments to files/folder
    Given the user is on the login page
    When the user clicks the "Files" module
    And user click action-icon  from any file on the page
    And user choose the Details option
    And user write a comment inside the input box
    And user click the submit button to post it
    Then Verify the comment is displayed in the comment section.