@ui
  Feature: Vice Dean Leaves Start Time and Stop Time Empty
    Scenario: Vice Dean should not be able to leave Start Time and Stop Time Empty
      Given user login as a Vice Dean
      And User clicks on the "Lesson Program" button
      And User selects an education class from the provided options.
      And User chooses the educational terms from the available list.
      And User selects a day from the dropdown menu.
      And User doesnt choose a start time from the provided time slots.
      And User doesnt select a stop time from the available time slots.
      Then User clicks on the "Submit" button.












