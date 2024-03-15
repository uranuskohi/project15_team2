
@userStory09
Feature: Vice Deans should be able to view the lesson list and make updates
  Background:
    Given "Vice Dean" should be already logged in the "https://managementonschools.com" website as a "Vice Dean"
    And Click on Login
    And Enter username
    And Enter password
    And Click on login button

    Scenario: TC_01 Being able to see the lesson details as a Vice Dean and update the information
    When click on Lessons
    And scroll down to Lesson List
    And vice dean can see the Lesson Name
    And vice dean can see the Compulsory field
    And vice dean can see the Credit
    And vice dean is able to see and delete the created lesson
    And vice dean should be able to update the lesson






