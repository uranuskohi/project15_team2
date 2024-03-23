@US_22
Feature: User adds Admin
  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "AdminBatch197" in the userName input field
    And enters "Batch197+" in the password input field
    And clicks on Login button
  @US_22_TC01
  Scenario: Admin should be able to add Admin
    And enters "Ashley" in the name field
    And enters "Smith" in the Surname field
    And enters "Istanbul" in the Birth Place field
    And enters "Female" in Gender field
    And enters "05/10/1977" in DateOfBirth field
    And enters "505-446-4646" in Phone Number field
    And enters ssn in SSN field
    And enters "Asmith" in Username field
    And enters password in Password field
    And clicks on the Submit button
    Then verifies success message "Admin Saved"
    And scrolls down to the last page
    And goes to the last page
    And scrolls up to the admin list
    And Delete if the admin name "Ashley Smith" exist on the Admin List
    Then verifies message "Admin deleted Successful" message
    And close the application

  @US_22_TC02
  Scenario: Admin shouldn't be created with blank name field
#    And leaves blank in the name field
   # And scrolls up to the list
    And enters "Smith" again in the surname field
    And enters "Istanbul" in Birth Place box
    And clicks "Female" in Gender radio button
    And enters "05/10/1977" in DateOfBirth field
    And enters "505-446-4646" in Phone Number field
    And enters ssn in SSN field
    And enters "Asmith" in Username field
    And enters password in Password field
    And clicks on Submit button
    Then verifies "Required" message
    And close the application