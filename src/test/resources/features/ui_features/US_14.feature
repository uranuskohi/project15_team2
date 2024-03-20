@US14_vicedean_updates_teacher
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
    Given user finds "username" on teacher list
    Then verify "name" in name field
    And verify "phone" in phone field
    And verify "ssn" in ssn field
    And verify "username" in user name field
#    When clicks on edit button
#    And enters "Cypress" in select lesson field as "vice dean"
#    And enters "Helen" in name field
#    And enters "Jones" in surname field
#    And enters "Paris" in birth place field
#    And enters "helen@gmail.com" in email field
#    And enters "791-702-5406" in phone field
#    And enters "108-25-2306" in ssn field
#    And selects is advisor teacher
#    And selects gender radio button
#    And enters "01/02/2003" in date of birth field
#    And enters "helenjones" in user name field for "@US14_TC01"
#    And enters "HELENjones1" in password field
#    And clicks submit button
#    Then verify success message "Teacher updated Successful"
#    And close the application

#  @US14_TC02
#  Scenario: vice dean updates teacher with invalid information
#    Given user finds "teacher" on teacher list
#    When clicks on edit button
#    And enters "C#" in select lesson field as "vice dean"
#    And enters "Charlie" in name field
#    And enters "Brown" in surname field
#    And enters "Madrid" in birth place field
#    And removes email from email field
#    And enters "841-031-5783" in phone field
#    And enters "584-25-2354" in ssn field
#    And selects is advisor teacher
#    And selects gender radio button
#    And enters "03/02/2004" in date of birth field
#    And enters "charliebrown" in user name field for "scenario"
#    And enters "CHARLIEb1" in password field
#    And clicks submit button
#    Then verify error message "Required"
#    And close the application