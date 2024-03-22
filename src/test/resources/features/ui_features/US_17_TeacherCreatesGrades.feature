@US_17 @smoke
Feature: US_17

  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "TeacherGigi" in the userName input field
    And enters "TeacherGigi1" in the password input field
    And clicks on Login button

  Scenario Outline: TC_01 Teacher successfully enters grades for student
    And Delete if the student name "<student>" exist on the Student Info List
    And The teacher selects a lesson as "<lesson>", student as "<student>" and semester as "<semester>" from the respective dropdown menus
    And The teacher enters the number of absences as "<absences>" for the student
    And The teacher enters valid grades for the midterm exam as "<midterm>" and final exam as "<final>" fields
    And The teacher enters "<information>" notes about the student
    And The teacher submits the student information
    Then Verify the new student information "<student>" is displayed in the student info list
    And close the application

    Examples:
      | lesson | student      | semester        | absences | midterm | final | information   |
      | Java   | Harry Potter | SPRING_SEMESTER | 0        | 100     | 100   | Dobby is free |


  Scenario Outline: TC_02 The teacher leaves midterm and final exam grades blank
    And The teacher selects a lesson as "<lesson>", student as "<student>" and semester as "<semester>" from the respective dropdown menus
    And The teacher enters the number of absences as "<absences>" for the student
    And The teacher intentionally leaves the midterm "<midterm>" and final "<final>" exam grades fields blank
    And The teacher enters "<information>" notes about the student
    And The teacher submits the student information
    Then Verify Message appears indicating that midterm and final exam grades are required fields
    And close the application

    Examples:
      | lesson | student      | semester        | absences | midterm | final | information   |
      | Java   | Harry Potter | SPRING_SEMESTER | 0        |         |       | Dobby is free |







