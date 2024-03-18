@US_10

Feature: US_10
  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "ViceDeanYusa" in the userName input field
    And enters "ViceDeanYusa1" in the password input field
    And clicks on Login button

    @US10_TC01
  Scenario Template: : TC_01 Vice Dean should be able to select the start and end time for the course
    And User clicks on the menu button
    And User clicks on the Lesson management button
    And User clicks on the Lesson Program button
    And And User selects an education class "<lesson>" from the provided options
    And User chooses the educational terms "<semester>" from the available list
    And User selects a day "<day>" from the dropdown menu.
    And User chooses a start time "<start time>" from the provided time slots.
    And User selects a stop time "<stop time>" from the available time slots.
    Then User clicks on the submit button.
    And verify the warning Pop-up message displayed
    And close the application

    Examples:
      | lesson |    semester    |    day    | start time | stop time |
      |   C#   | SPRING_SEMESTER| WEDNESDAY |  7:00 AM   |  7:00 AM  |

  @US10_TC02
  Scenario Template: TC_02 Vice Dean should not be able to leave Start Time and Stop Time Empty
    And User clicks on the Lesson Program button
    And And User selects an education class "<lesson>" from the provided options
    And User chooses the educational terms "<semester>" from the available list
    And User selects a day "<day>" from the dropdown menu.
    And User doesn't choose a start time "<start time>" from the provided time slots.
    And User doesn't select a stop time "<stop time>" from the available time slots.
    Then User clicks on the Submit button.
    And verify the warning Pop-up message which is start time and stop time are required fields displayed
    And close the application

    Examples:
      | lesson |    semester    |    day    | start time | stop time |
      |   C#   | SPRING_SEMESTER| WEDNESDAY |            |           |











