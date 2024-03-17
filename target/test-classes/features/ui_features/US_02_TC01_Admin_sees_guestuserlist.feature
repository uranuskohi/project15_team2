@US_02_TC01
Feature: Admin sees Guest User list
    Scenario:
    Given user goes to url
    And user clicks Register button
    And enters "Deniz" in the Name input field
    And enters "Ugur" in the Surname input field
    And enters "Istanbul" in the Birth Place input field
    And enters "444-444-4545" in the phone field
    And clicks "Female" in the Gender field
    And enters "06-07-1977" in the Date Of Birth field
    And enters ssn in the Ssn input field
    And enters "Dugur" in the User Name field
    And enters password in the Password input field
    And clicks Register button
    Then verifies guest user is registered

 @US_02_TC02
    Scenario:
    And admin clicks on login button
    And enters "AdminBatch197" in username input field
    And enters "Batch197+" in password field
    And clicks on the login button
    And clicks on Menu button
    And clicks on guest user on the main menu
    Then verifies name,phone number,ssn and user name is visible







