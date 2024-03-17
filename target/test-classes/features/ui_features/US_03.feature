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
      | Evrim1 | admin_batch197@gmail.com | maths |  Joining a new maths class|

























