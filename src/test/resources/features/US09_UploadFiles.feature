@regression
Feature: As a user, I should be able to upload files to existing folders on the Files page.

  Background:Verify login with valid credentials
    Given the user is on the login page
    When user use username and passcode
    And user click the login button

  @uploadFolder
  Scenario: Verify users can upload a file to an existing folder.

    Given User on the dashboard page

    When the user clicks the "Files" module

    And user choose a folder from the page

    And user clicks the add icon on the top

    When the user uploads a file with the upload file option

    Then Verify the file is displayed on the page