@US13_DB
Feature: US13_DB

  Scenario: user validates created teacher on DB
    Given user connects to application database
    And creates statement
    When user executes query for created teacher
    Then validates result set
    And user terminate connection
