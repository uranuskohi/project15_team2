@ui
Feature: Vice Dean views the Lesson, Day, Start Time and Stop Time created.
  Scenario: Vice Dean should be able to view the Lesson, Day, Start Time and Stop Time created
    Given user login as a Vice Dean
    And User clicks on the "Lesson Program" button
    And User sees "Lesson Program List" details
    And User sees "Lesson" in the Lesson Program List
    And User sees "Day" in the Lesson Program List
    And User sees "Start Time" in the Lesson Program List
    Then User sees "Stop Time" in the Lesson Program List