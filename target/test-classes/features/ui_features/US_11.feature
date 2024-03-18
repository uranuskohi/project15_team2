@US_11

Feature: US_11
  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "ViceDeanYusa" in the userName input field
    And enters "ViceDeanYusa1" in the password input field
    And clicks on Login button

  Scenario: TC_01 Vice Dean should be able to view the Lesson, Day, Start Time and Stop Time created
    And User clicks on the "Lesson Program" button
    And User sees "Lesson Program List" details
    And User sees "Lesson" in the Lesson Program List
    And User sees "Day" in the Lesson Program List
    And User sees "Start Time" in the Lesson Program List
    Then User sees "Stop Time" in the Lesson Program List
    And close the application

  Scenario: TC_02 Vice Dean should be able to update from the Lesson Program List.(VALID)
    And User clicks on the "Lesson Program" button
    And User sees "Lesson Program List" details
    And User sees "Lesson" in the Lesson Program List
    And User sees "Day" in the Lesson Program List
    And User sees "Start Time" in the Lesson Program List
    And User sees "Stop Time" in the Lesson Program List
    Then User cannot click on the Update Button
    And close the application

