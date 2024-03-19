@US24_admin_creates_teacher
Feature: admin creates teacher
  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "adminsarahfp" in the userName input field
    And enters "ADMINSarahFP1" in the password input field
    And clicks on Login button
    And clicks on Menu button
    And clicks on "Teacher Management" on Main Menu

  @US24_TC01
  Scenario: admin creates teacher with valid information
    When enters "Java" in select lesson field as "admin"
    And enters "Bob" in name field
    And enters "Smith" in surname field
    And enters "London" in birth place field
    And enters "bob@gmail.com" in email field
    And enters "102-203-3045" in phone field
    And selects is advisor teacher
    And selects gender radio button
    And enters "01/01/2000" in date of birth field
    And enters "401-50-6012" in ssn field
    And enters "bobsmith" in user name field for "scenario"
    And enters "BOBsmith123" in password field
    And clicks submit button
    Then verify success message "Teacher saved successfully"
    And verify "teacher" exists in teacher list
    And close the application

  @US24_TC02
  Scenario: admin creates teacher with invalid information
    When enters "Java" in select lesson field as "admin"
    And enters "Peter" in name field
    And enters "Piper" in surname field
    And enters "London" in birth place field
    And enters "peter@gmail.com" in email field
    And enters "201-302-5403" in phone field
    And selects is advisor teacher
    And selects gender radio button
    And enters "02/02/2002" in date of birth field
    And enters only 8 digits "104-05-210" in ssn field
    And enters "peterpiper" in user name field for "scenario"
    And enters "PETERpiper1" in password field
    And clicks submit button
    Then verify error message "Minimum 9 character (XXX-XX-XXXX)"
    And verify "teacher" does not exist in teacher list
    And close the application