@US_18
Feature: US_18

  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "TeacherGigi" in the userName input field
    And enters "TeacherGigi1" in the password input field
    And clicks on Login button

  Scenario Outline: TC_01 Teacher views, updates, and deletes student grade information
    And The student grades must be exist on the List, if not create it with lesson as "<lesson>", student as "<student>" and semester as "<semester>", absences as "<absences>" midterm exam as "<midterm>" and final exam as "<final>", "<information>" notes and submit
    And The teacher clicks the Edit button to update of the student "<student>"
    And The teacher modifies the midterm "<midtermUpdated>" and final "<finalUpdated>" exam grades
    And The teacher submits the updated grades
    And close the pop-up
    Then The teacher verifies that the midterm "<midtermUpdated>" and final "<finalUpdated>" exam grades updated of the student "<student>"
    And The teacher clicks the Delete button of the student "<student>"
    Then The teacher verifies that the deleted student "<student>" is no longer present in the Student Info List.
    And close the application

    Examples:
      | lesson | student      | semester        | absences | midterm | final | information   | midtermUpdated | finalUpdated |
      | Java   | Harry Potter | SPRING_SEMESTER | 0        | 100     | 100   | Dobby is free | 5              | 5            |

  Scenario Outline: TC_02  Teacher Attempts to Update Invalid Student Grade Information
    And The student grades must be exist on the List, if not create it with lesson as "<lesson>", student as "<student>" and semester as "<semester>", absences as "<absences>" midterm exam as "<midterm>" and final exam as "<final>", "<information>" notes and submit
    And The teacher clicks the Edit button to update of the student "<student>"
    And The teacher modifies the midterm "<invalidMidterm>" and final "<invalidFinal>" exam grades
    And The teacher submits the updated grades
    Then verify the warning Pop-up message displayed
    And close the application

    Examples:
      | lesson | student      | semester        | absences | midterm | final | information   | invalidMidterm | invalidFinal |
      | Java   | Harry Potter | SPRING_SEMESTER | 0        | 100     | 100   | Dobby is free | 500            | 500         |
