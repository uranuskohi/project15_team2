@create_student_asvicedean
  Feature: Vice dean creates student
    Background:
      Given user goes to "https://managementonschools.com/" homepage
      And clicks on loginIcon
      And enters "ViceDeanEsra" in the userName input field
      And enters "ViceDeanEsra123" in the password input field
      And clicks on Login button
      And clicks on Menu button



      Scenario Outline:
      When user clicks on Student Management on Main Menu
      And enters name in the user
      And close the application
        Examples:
        |name|
        |  Adam  |




