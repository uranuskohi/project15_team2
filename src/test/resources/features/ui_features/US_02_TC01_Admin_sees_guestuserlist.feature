
Feature: Guest user registers
  Background:
    When user goes to "https://managementonschools.com/" homepage

    Scenario Outline:

    And user clicks Register button
    And enters name in the Name input field
    And enters surname in the Surname input field
    And enters birthplace in the Birth Place input field
    And enters phone in the phone field
    And clicks gender in the Gender field
    And enters dateOfBirth in the Date Of Birth field
    And enters ssn in the Ssn input field
    And enters username in the User Name field
    And enters password in the Password input field
    And user clicks Register button




