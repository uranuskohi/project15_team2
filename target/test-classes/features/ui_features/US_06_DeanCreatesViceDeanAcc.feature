@US_06_UI

  Feature: Dean creates a Vice Dean Account
    Background:
    Given user goes to "https://managementonschools.com/" homepage

      And clicks on loginIcon
      And enters "Oz14" in the userName input field
      And enters "Simdiokul3" in password field
      And clicks on Login button

   @US_06_TC_01

      Scenario Outline: TC_01 Dean creates Vice Dean Account with valid info

        When user enters the "<Name>" as an user name
        And enters the surname as "<Surname>"
        And enters the brith place as "<Birth Place>"
        And selects the "<gender>" radio button
        And enters the "<Date Of Birth>" in date of birth field
        And enters the phone number as "<Phone>"
        And enters the "<Ssn>" in ssn field
        And user enter a "<User Name>" as an user name
        And enters the "<Password>" in password field
        And clicks on the Submit button
        Then verify the vice dean is created successfully message
        And close the application

     Examples:
          | Name | Surname | Birth Place | gender | Date Of Birth | Phone        | Ssn         | User Name | Password     |
          | Oz23 | Melis   | London      | Female | 21/03/2000    | 981-601-2324 | 601-98-1201 | 1212      | Bitsinartik1 |



  @US_06_TC_02


    Scenario Outline: TC_02 Dean should NOT be able to create a Vice Dean Account with name field empty
          When leave the "<Name>" empty
          And enter  the surname as "<Surname>"
          And enters birth place as "<Birth Place>"
          And selects the "<gender>" radio button
          And enters the"<Date Of Birth>" in date of birth field
          And enters the phone number as "<Phone>"
          And enters the "<Ssn>" in ssn field
          And user enters the "<User Name>" as an user name
          And enters the "<Password>" in password field
          And clicks on Submit button
          Then user sees the required message
          And close the application



      Examples:
        | Name |  | Surname |  | Birth Place |  | gender |  | Date Of Birth |  | Phone        |  | Ssn        |  | User Name |  | Password   |
        |      |  | Tolga   |  | Ankara      |  | Male   |  | 12/06/1999    |  | 777-666-9091 |  | 456-65-123 |  | Kedi      |  | Yettigari1 |