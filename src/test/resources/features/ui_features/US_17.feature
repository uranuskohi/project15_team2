@US_17
  Feature: US_17

    Background:
      Given esradan al
      And ....

    Scenario: TC_01 Teacher successfully enters grades for student
      And The teacher selects a lesson, student, and semester from the respective dropdown menus
      And The teacher enters the number of absences for the student
      And The teacher enters valid grades for the midterm and final exam fields
      And The teacher enters information notes about the student
      And The teacher submits the student information
      Then Verify the new student information is displayed in the student info list

    Scenario: TC_02 The teacher leaves midterm and final exam grades blank







