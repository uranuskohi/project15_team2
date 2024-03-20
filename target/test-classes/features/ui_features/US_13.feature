@US13_vicedean_creates_teacher
Feature: vice dean creates teacher
  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "vdsarahfp" in the userName input field
    And enters "VDSarahFP123" in the password input field
    And clicks on Login button
    And clicks on Menu button
    And clicks on "Teacher Management" on Main Menu

  @US13_TC01
  Scenario: vice dean creates teacher with valid information
    When enters "Java" in select lesson field as "vice dean"
    And enters "name" in name field
    And enters "surname" in surname field
    And enters "birthplace" in birth place field
    And enters "email" in email field
    And enters "ssn" in phone field
    And selects is advisor teacher
    And selects gender radio button
    And enters "dateofbirth" in date of birth field
    And enters "ssn" in ssn field
    And enters "username" in user name field
    And enters "password" in password field
    And clicks submit button
    Then verify success message "Teacher saved successfully"
    And verify "teacher" exists in teacher list
    And close the application

#  @US13_TC02
#  Scenario: vice dean creates teacher with invalid information
#    When enters "Java" in select lesson field as "vice dean"
#    And enters "Peter" in name field
#    And enters "Piper" in surname field
#    And enters "London" in birth place field
#    And enters "peter@gmail.com" in email field
#    And enters "201-302-5403" in phone field
#    And selects is advisor teacher
#    And selects gender radio button
#    And enters "02/02/2002" in date of birth field
#    And enters only 8 digits "104-05-210" in ssn field
#    And enters "peterpiper" in user name field for "scenario"
#    And enters "PETERpiper1" in password field
#    And clicks submit button
#    Then verify error message "Minimum 9 character (XXX-XX-XXXX)"
#    And verify "teacher" does not exist in teacher list
#    And close the application
#
#
#
