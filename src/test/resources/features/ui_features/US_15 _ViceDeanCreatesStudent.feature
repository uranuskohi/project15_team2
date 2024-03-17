@create_student_asvicedean
  Feature: Vice dean creates student

    Background:
      Given user goes to "https://managementonschools.com/" homepage
      And clicks on loginIcon
      And enters "AdminBatch197" in the userName input field
      And enters "Batch197+" in the password input field
      And clicks on Login button
      And clicks on Menu button
      And clicks on "Student Management" on Main Menu



      Scenario Outline:
      When user enters chooses advisor teacher as "name"
      And enters "<name>" in the name input field
      And close the application
        Examples:
        |name|
        |  Adam  |




