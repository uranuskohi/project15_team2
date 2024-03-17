Feature: US_01 Prospective Students Should Be Able to Register in the System with Valid Data

  Scenario Outline:
    Given user goes to home page "https://managementonschools.com"
    When user clicks on "RegisterLink"
    And user enters "<Name>" as a name
    And user enters "<Surname>" as surname
    And user enters "<Birth Place>"  as a birth place
    And user enters "<Phone>"  as a phone number
    And user clicks on Female Radio button and selects Female as a gender Radio button and selects Male as a gender
    #Then user scrolls down to Date of Birth box
    And user enters "<month>", "<day>", "<year>"  as a birth date
    And user enters an invalid "<Ssn>" as an Ssn
    And user enters a "<User Name>" as an user name
    And user enters a "<Password>" as a password
    And user clicks on Register button

    Examples:
      | Name   | Surname | Birth Place | Phone        | month | day | year | Ssn         | User Name | Password |
      | Regevr | Regosm  | Istanbul    | 078-743-6788 | 01    | 20  | 1978 | 246-78-8888 | Evrim12   | Turkey34 |