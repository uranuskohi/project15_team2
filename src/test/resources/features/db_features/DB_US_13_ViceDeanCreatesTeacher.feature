@US13_DB
Feature: US13_DB

  Scenario: vice dean creates teacher
    Given user connects to application database
    And creates statement
    When user executes query for created teacher
    Then validates result set
    And user terminate connection
