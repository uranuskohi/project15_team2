@US_01
Feature: US_01 Prospective Students Should Be Able to Register in the System with Valid Data

  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And user clicks on Register button1

  Scenario: US_01
    And user enters "Regevr" as a name
    And user enters "Regosm" as surname
    And user enters "Istanbul"  as a birth place
    And user enters "078-743-6788"  as a phone number
    And user clicks on Female Radio button and selects Female as a gender Radio button and selects Male as a gender
    And user enters "01", "20", "1978"  as a birth date
    And user enters an invalid "246-78-8888" as an Ssn
    And user enters a "Evrim1" as an user name
    And user enters a "Turkey34" as a password
    And user clicks on Register button

