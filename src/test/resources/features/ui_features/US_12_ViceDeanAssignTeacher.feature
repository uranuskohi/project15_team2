@US_12

Feature: US_12
  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "ViceDeanYusa" in the userName input field
    And enters "ViceDeanYusa1" in the password input field
    And clicks on Login button
    And clicks on Menu button
    And clicks on "Lesson Management" on Main Menu


  @US_12_TC01
    Scenario Template: TC_01 Vice Deans should be able to select a teacher for the lesson
      And User clicks on the Lesson Program button
      And User chooses lesson(s) lesson from the provided list
      And User selects a teacher "<teacher>" from dropdown list
      Then User clicks on the Submit button
      And close the application


      Examples:
        |                                  lesson                                |      teacher      |
        |   Lesson: C#  Day: FRIDAY  Start Time: 08:45:00  Stop Time: 09:50:00   |    Teacher Gigi   |


  @US_12_TC02
  Scenario Template: TC_02 Vice Deans should not leave teacher field blank

    And User clicks on the Lesson Program button
    And User chooses lesson(s) lesson from the provided list
    And User initially leaves teacher "<teacher>" field blank
    Then User clicks on the Submit button
    And close the application

    Examples:
      |                                  lesson                                |      teacher      |
      |   Lesson: C#  Day: FRIDAY  Start Time: 08:45:00  Stop Time: 09:50:00   |                   |








