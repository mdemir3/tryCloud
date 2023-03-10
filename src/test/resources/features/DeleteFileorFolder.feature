@Hikmet2
Feature: As a user, I should be able to delete a file/folder.
  Background:Verify login with valid credentials
    Given the user is on the login page
    When user use username and passcode
    And user click the login button
  Scenario: Verify users delete a file/folder

Given user on the home page
When the user clicks the "Files" module
And user click action-icon from any file on the page
And user choose the "Delete file/folder“ option
When the user clicks the "Deleted file/folder” sub-module on the left side
