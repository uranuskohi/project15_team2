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
      And close the application
      Examples:
        | Name | Surname | Birth Place | Gender | Birth Date | PhoneNumber | SSNNumber | Username | Password |
#        | Jane1 | Eyre1 | Toronto | Female | 001789-09-10 | 416 235 2315 | 123 12  1231 | JaneyE2 | Janey3!! |
        | Jane31 | Eyre31 | Toronto | Female | 001719-09-12 | 416 215 2323 | 123 12  1212 | JaneyE1 | Janey1!! |
   #     | Janer | Eyrer | Toronto | Female | 001789-09-10 | 416 235 2356 | 123 12  1235 | JaneyR | Janer3!! |


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
      And close the application
      Examples:
        | Name | Surname | Birth Place | Gender | Birth Date | PhoneNumber |
        | Janeer | Eyreeo | Toronto | Female | 001789-09-18 | 416 235 2358 |

