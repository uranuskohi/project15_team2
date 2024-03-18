
@userStory09
Feature: Vice Deans should be able to view the lesson list and make updates
  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "uranuskohi" in the userName input field
    And enters "Helloworld0" in the password input field
    And clicks on Login button

    Scenario: TC_01 Being able to see the lesson details as a Vice Dean and update the information
    When click on Lessons
    And scroll down to Lesson List
    And vice dean can see the Lesson Name
    And vice dean can see the Compulsory field
    And vice dean can see the Credit
    And vice dean is able to see and delete the created lesson
    And vice dean should be able to update the lesson
      And close the application

