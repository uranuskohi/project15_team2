
@water @uranus
Feature: ViceDeanCreation
  Scenario Outline: Checking created vice dean
    Given user connects to application database
    When admin gets the "*" column from the table "<tableName>"
    And read column "<columnName>" data from "<tableName>"
    Then verify "<tableName>" and column "<columnName>" contains "<data>"
    And user terminate connection
    Examples:
      | tableName | columnName | data       |
      | vice_dean | username   | uranuskohi |