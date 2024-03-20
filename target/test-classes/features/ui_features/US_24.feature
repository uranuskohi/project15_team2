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
    And enters "name" in name field
    And enters "surname" in surname field
    And enters "birthplace" in birth place field
    And enters "email" in email field
    And enters "phone" in phone field
    And selects is advisor teacher
    And selects gender radio button
    And enters "dateofbirth" in date of birth field
    And enters "ssn" in ssn field
    And enters "username" in user name field
    And enters "password" in password field
    And clicks submit button
    Then verify success message "Teacher saved successfully"
    And close the application

  @US24_TC02
  Scenario: admin creates teacher with invalid information
    When enters "Java" in select lesson field as "admin"
    And enters "name" in name field
    And enters "surname" in surname field
    And enters "birthplace" in birth place field
    And enters "email" in email field
    And enters "phone" in phone field
    And selects is advisor teacher
    And selects gender radio button
    And enters "dateofbirth" in date of birth field
    And enters only 8 digits "ssn" in ssn field
    And enters "username" in user name field
    And enters "password" in password field
    And clicks submit button
    Then verify error message "Minimum 9 character (XXX-XX-XXXX)"
    And close the application