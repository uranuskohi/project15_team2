@US_19 @fatih
  Feature: Teacher creates meeting with students
    Background:
      Given user goes to "https://managementonschools.com/" homepage
      And clicks on loginIcon
      And enters "TeacherGigi" in the userName input field
      And enters "TeacherGigi1" in the password input field
      And clicks on Login button
      And clicks on Menu button
      And clicks on "Meet Management" on Main Menu

      @US19_TC01
    Scenario: User schedules a meeting with specific details
      Given delete if the student name "Harry Potter" exist on the Meet List
      Given the user is on the scheduling page
      When the user chooses "Harry Potter" from the dropdown menu
      And the user enters the date of the meeting as "002024-05-16"
      And the user types the start time as "1300"
      And the user types the stop time as "1400"
      And the user types the description as "Presentation"
      And the user clicks the Submit button
      And verify meeting saved successfully pop up message
      And close the application

      @US19_TC02
    Scenario: User schedules a meeting with specific details but wrong date
      Given the user is on the scheduling page
      When the user chooses "Harry Potter" from the dropdown menu
      And the user enters the date of the meeting as "002022-05-16"
      And the user types the start time as "1300"
      And the user types the stop time as "1400"
      And the user types the description as "Presentation"
      And the user clicks the Submit button
      And verify must be a future date error pop up message
      And close the application
