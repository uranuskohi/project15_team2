@US_20 @fatih @smoke
Feature: Teacher creates meeting with students
  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "TeacherGigi" in the userName input field
    And enters "TeacherGigi1" in the password input field
    And clicks on Login button
    And clicks on Menu button
    And clicks on "Meet Management" on Main Menu

    @US20_TC01
    Scenario:The teacher should be able to view, update and delete meetings
      Given the user is on the Meet List page
      And the user sees the meeting arranged from US_19
      When the user clicks on the Edit button
      And changes the Date of Meet to "002024-05-17"
      And clicks Submit
      Then the user should see the updated meeting details
      When the user clicks on the trash bin icon next to the meeting
      Then the meeting should be deleted successfully
      And close the application

    @US20_TC02
    Scenario: User edits meeting with invalid date and then deletes it
      Given the user is on the Meet List page
      And the user sees the meeting arranged from US_19
      When the user clicks on the Edit button
      And changes the Date of Meet to "002022-05-16"
      And clicks Submit
      Then the user should see the Must be a future date error pop-up message
      When the user dismisses the error pop-up
      And the user clicks on the trash bin icon next to the meeting
      Then the meeting should be deleted successfully
      And close the application
