@US_17_DB
Feature: US_17_DB

  Scenario Outline: User Validates Created Student Info From DB
    Given user connects to application database
    When user gets the "*" column from the table "<tableName>" for student info grades
    Then verify "<tableName>" table and "<columnName>" column contains "<data>"
    And user terminate connection
    Examples:
      | tableName    | columnName   | data          |
      | student_info | student_id   | 3283          |
      | student_info | absentee     | 0             |
      | student_info | midterm_exam | 100           |
      | student_info | final_exam   | 100           |
      | student_info | info_note    | Dobby is free |