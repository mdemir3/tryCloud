@regression
Feature:  As a user, I should be able to search any item/ users from the homepage.

  Background:Verify login with valid credentials
    Given the user is on the login page
    When user use username and passcode
    And user click the login button

  Scenario: Verify users can search any files/folder/users from the search box.
    When the user clicks the magnifier icon on the right top
    And users search any existing "User46" user name
    Then verify the app displays the expected result "User46"
