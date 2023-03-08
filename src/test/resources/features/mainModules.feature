@soukaina
Feature: As a user, I should be accessing all the main modules of the app.

  Background:Verify login with valid credentials
    Given the user is on the login page
    When user use username and passcode
    And user click the login button

  Scenario:  Verify users accessing all the main modules of the app.
    Then Verify the user see the following modules:
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |