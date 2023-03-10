@regression
Feature: As a user, I should be able to upload a file.

  Background:Verify login with valid credentials
    Given the user is on the login page
    When user use username and passcode
    And user click the login button


  Scenario: verify users to upload a file from Files
    Given User on the dashboard page
    When the user clicks the "Files" module
    When the user clicks the add icon on the top
    And users uploads file with the “upload file” option
    Then verify the file is displayed on the page


