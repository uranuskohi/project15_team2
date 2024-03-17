@US_22_TC01
Feature: Admin adds Admin
  Scenario: Admin should be able to add Admin
    Given admin goes to the homepage url
    And clicks on login option
    And enters "AdminBatch197" in username input field
    And enters "Batch197+" in password field
    And clicks on the login button
    And enters "Ashley" in the name field
    And enters "Smith" in the Surname field
    And enters "Istanbul" in the Birth Place field
    And enters "Female" in Gender field
    And enters "05/10/1977" in DateOfBirth field
    And enters "505-446-4646" in Phone Number field
    And enters ssn in SSN field
    And enters "Asmith" in Username field
    And enters password in Password field
    And clicks on Submit button
    Then verifies Admin is created

  @US_22_TC02
    Scenario: Admin shouldn't be created with blank name field
    And admin is in admin management page
    And leaves blank in the name field
    And enters "Smith" in the Surname field
    And enters "Istanbul" in the Birth Place field
    And enters "Female" in Gender field
    And enters "05/10/1977" in DateOfBirth field
    And enters "505-446-4646" in Phone Number field
    And enters ssn in SSN field
    And enters "Asmith" in Username field
    And enters password in Password field
    And clicks on Submit button
    Then verifies Admin is not created