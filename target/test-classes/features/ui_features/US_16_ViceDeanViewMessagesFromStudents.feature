@US_16_UI @smoke
Feature: Vice Dean should be able to view the messages sent by users.

  Background: Sign in as a vice dean
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "ViceDeanEsra" in the userName input field
    And enters "ViceDeanEsra123" in the password input field
    And clicks on Login button
    And clicks on Menu button
    And clicks on "Contact Get All" on Main Menu


  @US_16_TC_01
  Scenario:The Vice Dean should be able to view the messages, their authors, emails, sending date and subject information
    Then verify Name is visible
    Then verify Email is visible
    Then verify Date is visible
    Then verify Subject is visible
    Then verify message is visible
    And close the application



  @US_16_TC_02
    Scenario: The Vice Dean should be able to delete messages
    Then verify ability to delete messages
    And close the application