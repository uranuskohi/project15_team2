
@userStory23 @hehe
Feature: Admin should be able to add Vice Dean
  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "AdminBatch197" in the userName input field
    And enters "Batch197+" in the password input field
    And clicks on Login button

    Scenario Outline: TC_01 Admin adding a Vice Dean
    When admin is logged in the website
    And click on menu
    And click on Vice Dean Management
    And admin should see the Vice Dean Management Filed
    And enter name as "<Name>"
    And enter surname as "<Surname>"
    And enter brith place as "<Birth Place>"
    And select the "<gender>"
    And write the correct "<Brith Date>"
    And enter phone number as "<Phone Number>"
    And write the SSN as "<SSN Number>"
    And write the "<username>"
    And add "<Password>"
    And click on Submit button for Vice Dean creation
    Then verify the Vice Dean is created
    And close the application
      Examples:
        | Name   | Surname | Birth Place | gender | Brith Date | Phone Number | SSN Number  | username    | Password     |
        | Madrid | Madrid  | Spain       | Male   | 12/25/1890 | 363-918-0845 | 987-98-9876 | madridspain | Madridspain0 |



  Scenario Outline: TC_02 Admin adding a Vice Dean without adding the password
    When admin is logged in the website
    And click on menu
    And click on Vice Dean Management
    And admin should see the Vice Dean Management Filed
    And enter name as "<Name>"
    And enter surname as "<Surname>"
    And enter brith place as "<Birth Place>"
    And select the "<gender>"
    And write the correct "<Brith Date>"
    And enter phone number as "<Phone Number>"
    And write the SSN as "<SSN Number>"
    And write the "<username>"
    And leave "<password>" empty
    And click on Submit button for Vice Dean creation
    Then Verify the Vice Dean is not created
    And close the application
    Examples:
      | Name   | Surname | Birth Place | gender | Brith Date | Phone Number | SSN Number  | username    |password|
      | Madrid | Madrid  | Spain       | Male   | 12/25/1890 | 369-258-0147 | 987-98-9876 | madridspain |        |




