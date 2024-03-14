@US13_Create_Teacher
Feature: vice dean creates teacher

  Background:
    Given "vice dean" goes to "https://managementonschools.com/" homepage
    And clicks on login icon
    And enters username in user name field
    And enters password in password field
    And clicks on menu icon
    And clicks on teacher management

  Scenario Outline:
    When "vice dean" selects "<lesson>" from dropdown
    And enters "<name>" in name field
    And enters "<surname>" in surname field
    And enters "<birth place>" in birth place field
    And enters "<email>" in email field
    And enters "<phone number>" in phone field
    And selects is advisor teacher
    And selects "male" gender radio button
    And selects date of birth in date of birth field
    And enters "<ssn>" in ssn field
    And enters "<username>" in user name field
    And enters "<password>" in password field
    And clicks submit button
    Then verify the teacher is created
    Examples:
      | lesson  | name    | surname | birth place | email           | phone number | ssn          | username   | password    |
      | Java    | Bob     | Smith   | London      | bob@gmail.com   | 102-203-3045 | 401-50-6012  | bobsmith   | BOBsmith123 |
      | Java    | Peter   | Piper   | London      | peter@gmail.com | 201-302-5403 | 104-05-210   | peterpiper | PETERpiper1 |
      | Cypress | Helen   | Jones   | Paris       | helen@gmail.com | 791-702-5406 | 108-25-2306  | helenjones | HELENjones1 |
      | C#      | Charlie | Brown   | Madrid      |                 | 841-031-5783    | 584-25-2354  | charliebrown | CHARLIEb1  |




