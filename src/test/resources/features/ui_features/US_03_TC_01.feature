@US_03_Contact
Feature: Users should be able to send messages from the page (contact)
  Background:
    Given User goes to "https://managementonschools.com/"
    When user clicks on Contact button

    Scenario:The user should be able to send their message.
    Given the user is on the Contact page
    When user clicks on Contact button
    And user click on your name field
    And user enters
    And user fill out your email "admin_batch197@gmail.com"
    And user fill out subject "Maths"
    And user fill out message "Joining a new math class"
    And user click send message
    Then close the application


