
@userStory21  @hehe
Feature: Students, choose lesson, grades and announcement
  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "uranus" in the userName input field
    And enters "Madrid01" in the password input field
    And clicks on Login button

    Scenario: TC_01 Student goes and see her/his exam grade and meeting announcement
    When student goes to Choose Lesson Management
    And student should be able to see the Teacher on the Choose Lesson List
    And student can see the day on the Choose Lesson List
    And student should be able to see the StartTime on the Choose Lesson List
    And student should see the StopTime on the Choose Lesson List
    And select the wanted Lessons
      And click on Submit button for add lesson
    And student is able to see the chosen Lessons on the Lesson Program List
    And student should be able to delete the chosen lesson from the list
    And student is not able to delete the chosen lesson from the list
    And student should click on the menu and should be able to see the Main Menu List
    And student should click on Grades and Announcements
    And student should be able to see his exam grades if it is added by their teacher in the Student Info List
    And student should be able to see the meeting created by his advisor on the Meet List
      And close the application