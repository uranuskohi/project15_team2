@US_03Contact
Feature: Users should be able to send messages from the page (contact)
  Background:
    Given User goes to "https://managementonschools.com/"
    When user clicks contact button

  Scenario:
    When click on contact
    And enters "Evrim1" in name field
    And enters "admin_batch197@gmail.com" in email field
    And enters "maths" in subject field
    And enters "Joining a new maths class" in message field
    And clicks submit button
    Then verify success message "Contact Message Created Successfully"
    And close the application











