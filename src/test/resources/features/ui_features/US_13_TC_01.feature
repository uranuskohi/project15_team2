@US13_create_teacher_asvicedean
Feature: vice dean creates teacher

  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "vdsarahfp" in the userName input field
    And enters "VDSarahFP123" in the password input field
    And clicks on Login button
    And clicks on Menu button
    And clicks on Teacher Management

  Scenario Outline:
    When user selects "Java" from dropdown
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
       | name    | surname | birth place | email           | phone number | ssn         | username     | password    |
       | Bob     | Smith   | London      | bob@gmail.com   | 102-203-3045 | 401-50-6012 | bobsmith     | BOBsmith123 |
       | Peter   | Piper   | London      | peter@gmail.com | 201-302-5403 | 104-05-210  | peterpiper   | PETERpiper1 |
       | Helen   | Jones   | Paris       | helen@gmail.com | 791-702-5406 | 108-25-2306 | helenjones   | HELENjones1 |
       | Charlie | Brown   | Madrid      |                 | 841-031-5783 | 584-25-2354 | charliebrown | CHARLIEb1   |
       | Tom     | Jones   | London      | tom@gmail.com   | 999-203-3045 | 888-50-6012 | tomjones     | TOMjones1   |





