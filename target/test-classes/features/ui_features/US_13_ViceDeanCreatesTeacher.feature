@US13 @Sarah
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
    And enters "Bob" in name field
    And enters "Smith" in surname field
    And enters "birthplace" in birth place field
    And enters "email" in email field
    And enters "102-203-3045" in phone field
    And selects is advisor teacher
    And selects gender radio button
    And enters "dateofbirth" in date of birth field
    And enters "401-50-6012" in ssn field
    And enters "bobsmith" in user name field
    And enters "password" in password field
    And clicks submit button
    Then verify success message "Teacher saved successfully"
    And close the application

  @US13_TC02
  Scenario: vice dean creates teacher with invalid information
    When enters "Java" in select lesson field as "vice dean"
    And enters "Bob" in name field
    And enters "Smith" in surname field
    And enters "birthplace" in birth place field
    And enters "email" in email field
    And enters "102-203-3045" in phone field
    And selects is advisor teacher
    And selects gender radio button
    And enters "dateofbirth" in date of birth field
    And enters only 8 digits "ssn" in ssn field
    And enters "username" in user name field
    And enters "password" in password field
    And clicks submit button
    Then verify ssn error message "Minimum 9 character (XXX-XX-XXXX)"
    And close the application



