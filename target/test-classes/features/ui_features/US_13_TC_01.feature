@US13_create_teacher_asvicedean
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
    And enters "Bob" in name field
    And enters "Smith" in surname field
    And enters "London" in birth place field
    And enters "bob@gmail.com" in email field
    And enters "102-203-3045" in phone field
    And selects is advisor teacher
    And selects gender radio button
    And selects date of birth in date of birth field
    And enters "401-50-6012" in ssn field
    And enters "bobsmith" in user name field
    And enters "BOBsmith123" in password field
    And clicks submit button
    Then verify success message "Teacher saved successfully"
#    And close the application



