
@bread  @uranus
Feature: Choose a lesson
  Scenario Outline: student chooses a lesson
    Given user connects to application database
    When student gets the "*" column from the table "<tableName>"
    And read all column "<columnName>" data from "<tableName>"
    Then verify table "<tableName>" and column "<columnName>" contains "<data>"
    And user terminate connection
    Examples:
      | tableName      | columnName | data |
      | lesson_program | id         | 3969 |
