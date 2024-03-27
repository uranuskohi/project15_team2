@US14
Feature: vice dean updates teacher
  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "vdsarahfp" in the userName input field
    And enters "VDSarahFP123" in the password input field
    And clicks on Login button
    And clicks on Menu button
    And clicks on "Teacher Management" on Main Menu

  @US14_TC01
  Scenario: vice dean updates teacher list with valid information
    Given user clicks on last page of teacher list
    When finds created teacher
    Then verify "fullname" in name field
    And verify "phone" in phone field
    And verify "ssn" in ssn field
    And verify "username" in user name field
    When clicks on edit button
    And enters "Cypress" in edit select lesson field
    And enters "name" in edit name field
    And enters "lastname" in edit surname field
    And enters "birthplace" in edit birth place field
    And enters "email" in edit email field
    And enters "phone" in edit phone field
    And enters "ssn" in edit ssn field
    And selects edit is advisor teacher
    And selects edit gender radio button
    And enters "dateofbirth" in edit date of birth field
    And enters "username" in edit user name field
    And enters "password" in edit password field
    And clicks edit submit button
    Then verify success message "Teacher updated Successful"
    And close the application

  @US14_TC02
  Scenario: vice dean updates teacher with invalid information
    Given user clicks on last page of teacher list
    When finds created teacher
    When clicks on edit button
    And enters "C#" in edit select lesson field
    And enters "name" in edit name field
    And enters "surname" in edit surname field
    And enters "birthplace" in edit birth place field
    And removes email from email field
    And enters "phone" in edit phone field
    And enters "ssn" in edit ssn field
    And selects edit is advisor teacher
    And selects edit gender radio button
    And enters "dateofbirth" in edit date of birth field
    And enters "username" in edit user name field
    And enters "password" in edit password field
    And verify email error message "Required"
    And close the application