@US_03Contact
Feature:  Users should be able to send messages from the page (contact)

  Scenario Outline: send a message from Contact page

    Given user goes to home page "https://managementonschools.com"
    Given user clicks Contact button
    And user enters a name "<name>"
    And user enters an email "<email>"
    And user enters a subject "<subject>"
    And user enters a message "<message>"
    And user clicks on Send Message button
    Then assert alert message on contact page
    And  close the app
    Examples:
      | name   | email                   | subject  | message               |
      | andrey | andrey_test01@gmail.com | greeting | first message to dean |












  //Feature: Users should be able to send messages from the page (contact)
  //Background:
  // Given User goes to "https://managementonschools.com/"
  //When user clicks contact button

  // Scenario:
  //When click on contact
  //And enters "Evrim1" in name field
  //And enters "admin_batch197@gmail.com" in email field
  //And enters "maths" in subject field
  // And enters "Joining a new maths class" in message field
  //And clicks submit button
  //Then verify success message "Contact Message Created Successfully"
  //And close the application












