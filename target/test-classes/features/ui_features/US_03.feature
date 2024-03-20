@US_03Contact
Feature:  Users should be able to send messages from the page (contact)


Background:
  Given user goes to "https://managementonschools.com/" homepage
    When user clicks Contact button


  Scenario: US_03Contact
    And user enters a name "Evrim1"
    And user enters an email "admin_batch197@gmail.com"
    And user enters a subject "maths"
    And user enters a message "Joining a new maths class"
    And user clicks on Send Message button
    Then assert alert message on contact page
    And  close the app


























