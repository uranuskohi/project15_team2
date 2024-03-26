@US_22_DB
Feature: User adds Admin

  Scenario: Verify inserted data at database
    When the user insert new login to database
    And verify database has new data

