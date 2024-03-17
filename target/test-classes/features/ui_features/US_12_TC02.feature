@ui
Feature:Vice Deans attempts to leave teacher field blank
  Scenario: Vice Deans shouldnt leave teacher field blank(INVALID)
    Given user login as a Vice Dean
    And User clicks on the "Lesson Program" button
    And User sees all the details on the "Lesson Program Assignment" list
    And User chooses lesson(s) from the provided list
    And User initially leaves teacher field blank
    Then User clicks on the "Submit" button