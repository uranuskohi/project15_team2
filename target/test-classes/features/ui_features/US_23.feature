
@userStory23
Feature: Admin should be able to add Vice Dean
  Background:
    Given "Admin" should be already logged in the "https://managementonschools.com" website as a "Admin"
    And Click on Login
    And Enter username
    And Enter password
    And Click on login button

    Scenario Outline: TC_01 Admin adding a Vice Dean
    When admin is logged in the website
    And click on menu
    And click on Vice Dean Management
    And admin should see the Vice Dean Management Filed
    And add "<Name>", and "<Surname>"
    And add "<Birth Place>"
    And select the "<gender>"
    And write the correct "<Brith Date>"
    And add "<Phone Number>"
    And write the "<SSN Number>"
    And write the "<username>"
    And add the "<Password>"
    And click on Submit button
    Then verify the Vice Dean is created
      Examples:
        | Name   | Surname | Birth Place | gender | Brith Date | Phone Number | SSN Number  | username    | Password     |
        | Madrid | Madrid  | Spain       | Male   | 12/25/1890 | 369-258-0147 | 987-98-9876 | madridspain | Madridspain0 |



  Scenario Outline: TC_02 Admin adding a Vice Dean without adding the password
    When admin is logged in the website
    And click on menu
    And click on Vice Dean Management
    And admin should see the Vice Dean Management Filed
    And add "<Name>", and "<Surname>"
    And add "<Birth Place>"
    And select the "<gender>"
    And write the correct "<Brith Date>"
    And add "<Phone Number>"
    And write the "<SSN Number>"
    And write the "<username>"
    And leave "password" empty
    And click on Submit button
    Then Verify the Vice Dean is not created
    Examples:
      | Name   | Surname | Birth Place | gender | Brith Date | Phone Number | SSN Number  | username    | Password     |
      | Madrid | Madrid  | Spain       | Male   | 12/25/1890 | 369-258-0147 | 987-98-9876 | madridspain |  |




