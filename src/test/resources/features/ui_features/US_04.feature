@userStory04 @sloane

  Feature:Admin should be able to add Dean
    Background:
  Given user goes to "https://managementonschools.com/" homepage
  And clicks on loginIcon
  And enters "AdminBatch197" in the userName input field
  And enters "Batch197+" in the password input field
  And clicks on Login button
  And clicks on Menu button
  And clicks on "Dean Management" on Main Menu



    @userStory04_tc01
  Scenario Outline: Create Dean successfully when signed in as Admin
    When add name "<Name>"
    And add last name "<Surname>"
    And add birthplace "<Birth Place>"
    And select the "<Gender>"
    And add birthdate "<Birth Date>"
    And add the phonenumber "<PhoneNumber>"
    And add ssn "<SSNNumber>"
    And add username "<Username>"
    And add password "<Password>"
    And clicks on the Dean Submit button
    Then verify the Dean is created
      Examples:
        | Name | Surname | Birth Place | Gender | Birth Date | PhoneNumber | SSNNumber | Username | Password |
        | Jane | Eyre | Toronto | Female | 1789-09-10 | 416 235 2355 | 123 12  1234 | JaneyE | Janey3!! |


    @userStory04_tc02
    Scenario Outline: Create Dean unsuccessfully, user inputs incorrect SSN, Username and Password
       When add name "<Name>"
    And add last name "<Surname>"
    And add birthplace "<Birth Place>"
    And select the "<Gender>"
    And add birthdate "<Birth Date>"
    And add the phonenumber "<PhoneNumber>"
    And add missing digit ssn "<SSNNumber>"
    And add username "<Username>"
    And add password "<Password>"
    And clicks on the Dean Submit button
    Then verify the Dean cannot be created
      Examples:
        | Name | Surname | Birth Place | Gender | Birth Date | PhoneNumber |
        | Janee | Eyree | Toronto | Female | 1789-09-10 | 416 235 2354 |

