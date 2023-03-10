
Feature: As a user, I should be able to add/create

Scenario: : Verify users can add the folder



@Hikmet1
Feature: As a user, I should be able to add/create
Background:Verify login with valid credentials
  Given the user is on the login page
  When user use username and passcode
  And user click the login button
Scenario: : Verify users can add the folder
Given User on the dashboard page


When the user clicks the "Files" module
And user clicks the add icon on the top
And user click "new folder”
And user write a folder name
When the user click submit icon
Then Verify the folder is displayed on the page
