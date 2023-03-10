@regression
Feature: As a user, I want to access to Photos module.
  Background:Verify login with valid credentials
    Given the user is on the login page
    When user use username and passcode
    And user click the login button

  Scenario:  verify user access to the photos module

    Given User on the dashboard page

    When the user clicks the Photos module

    Then verify there are following sub-modules

      | Your photos   |
      | Your videos     |
      | Favorites   |
      |Your folders |
      | Shared with you |
      | Tagged photos |

