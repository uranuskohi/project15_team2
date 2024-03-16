
Feature: Guest user registers and admin should be able to see the Guest user list
  Background:
    Given user goes to "https://managementonschools.com/" homepage

  Scenario: TC_01 Admin should be able to see the Guest User List (Guest Registration).

    When user clicks Register button
    And enters "Deniz" in the Name input field
    And enters "Ugur" in the Surname input field
    And enters "Istanbul" in the Birth Place input field
    And enters "444-444-4545" in the phone field
    And selects gender in the Gender radio button
    And selects dateOfBirth in the Date Of Birth field
    And enters "444-44-4545" in the Ssn input field
    And enters "Dugur" in the User Name field
    And enters "Dugur123" in the Password input field
    And user clicks Register button
    Then verify success message "Guest User registered."
