Feature: As a user, I want to access to Photos module.

@Photos
  Scenario:  verify user access to the photos module

    Given user on the dashboard page

    When the user clicks the Photos module

    Then verify there are following sub-modules

      | Your photos   |
      | Your videos     |
      | Favorites   |
      |Your folders |
      | Shared with you |
      | Tagged photos |

