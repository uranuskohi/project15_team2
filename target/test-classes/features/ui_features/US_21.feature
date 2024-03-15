
@userStory21
Feature: Students, choose lesson, grades and announcement
  Background:
    Given "Student" should be already logged in the "https://managementonschools.com" website as a "Student"
    And Click on Login
    And Enter username
    And Enter password
    And Click on login button

    Scenario: TC_01 Student goes and see her/his exam grade and meeting announcement
    When student goes to Choose Lesson Management
    And student should be able to see the Teacher on the Choose Lesson List
    And student can see the day on the Choose Lesson List
    And student should be able to see the StartTime on the Choose Lesson List
    And student should see the StopTime on the Choose Lesson List
    And select the wanted Lessons
    And student is not able to select two Lessons at the same time from the Lesson List
    And student is able to see the chosen Lessons on the Lesson Program List
    And student should be able to delete the chosen lesson from the list
    And student is not able to delete the chosen lesson from the list
    And student should click on the menu and should be able to see the Main Menu List
    And student should click on Grades and Announcments
    And student should be able to see her/his exam grades if it is added by their teacher in the Student Info List
    And student should be able to see the meeting created by her/his advisor on the Meet List