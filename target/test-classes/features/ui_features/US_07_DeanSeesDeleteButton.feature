@US_07_UI
Feature: Dean should be able to create vice dean

  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "Oz14" in the userName input field
    And enters "Simdiokul3" in the password input field
    And clicks on Login button

  @US_07_TC_01
  Scenario: The Dean should be able to delete messages
    Then verify ability to delete message
    And close the application