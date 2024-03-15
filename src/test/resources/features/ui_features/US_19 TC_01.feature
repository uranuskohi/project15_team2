@teacher_creates_meet
  Feature: Teacher creates meeting with students
    Background:
      Given user goes to "https://managementonschools.com/" homepage
      And clicks on loginIcon
      And enters "TeacherGigi" in the userName input field
      And enters "TeacherGigi1" in the password input field
      And clicks on Login button
      And clicks on Menu button
      And clicks on "Meet Management" on Main Menu

    Scenario: User schedules a meeting with specific details
      Given the user is on the scheduling page
      When the user chooses "Harry Potter" from the dropdown menu
      And the user enters the date of the meeting as "002024-05-16"
      And the user types the start time as "1300"
      And the user types the stop time as "1400"
      And the user types the description as "Presentation"
      And the user clicks the Submit button
      And close the application
