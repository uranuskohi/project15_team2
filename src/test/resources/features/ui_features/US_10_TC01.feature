@ui
  Feature: Vice Dean selects the start and end time for the course
  Scenario: Vice Dean should be able to select the start and end time for the course
    Given user login as a Vice Dean
    And User selects an education class from the provided options
    And User chooses the educational terms from the available list
    And User selects a day from the dropdown menu.
    And User chooses a start time from the provided time slots.
    And User selects a stop time from the available time slots.
    Then User selects a stop time from the available time slots.












