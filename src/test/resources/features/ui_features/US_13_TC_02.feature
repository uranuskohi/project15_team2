@US13_create_teacher_asvicedean_invalid
Feature: vice dean creates teacher
  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "vdsarahfp" in the userName input field
    And enters "VDSarahFP123" in the password input field
    And clicks on Login button
    And clicks on Menu button
    And clicks on "Teacher Management" on Main Menu

  Scenario:
    When enters "Java" in select lesson field
    And enters "Peter" in name field
    And enters "Piper" in surname field
    And enters "London" in birth place field
    And enters "peter@gmail.com" in email field
    And enters "201-302-5403" in phone field
    And selects is advisor teacher
    And selects gender radio button
    And enters "02/02/2002" in date of birth field
    And enters only 8 digits "104-05-210" in ssn field
    And enters "peterpiper" in user name field
    And enters "PETERpiper1" in password field
    And clicks submit button
    Then verify error message "Minimum 9 character (XXX-XX-XXXX)"
#    And close the application