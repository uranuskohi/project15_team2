
@userStory08
Feature: Vice Deans should be able to create a lesson
  Background:
    Given "Vice Dean" should be already logged in the "https://managementonschools.com" website as a "Vice Dean"
    And Click on Login
    And Enter username
    And Enter password
    And Click on login button

    Scenario Outline: TC_01 Adding new Lesson as a Vice Dean
      When click on Lessons
      And enter "<lesson name>" in the Lesson Name
      And check if Compulsory radio button is clickable
      And click on Compulsory radio button
      And add "<credit score>" in the Credit Score
      And click on Submit button
      Then verify the Lesson is created
      Examples:
        | lesson name | credit score |
        | recruiter   | 5            |


      Scenario Outline: TC_02 Adding new Lesson without Credit Score as a Vice Dean
        When click on Lessons
        And enter "<lesson name>" in the Lesson Name
        And check if Compulsory radio button is clickable
        And leave "Compulsory radio button" empty
        And don't add Credit Score
        And click on Submit button
        Then verify the Lesson is created
        Examples:
          | lesson name |
          | recruiter   |







