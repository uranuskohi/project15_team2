@ui
  Feature:Vice Deans selects a teacher for the lesson
    Scenario: Vice Deans should be able to select a teacher for the lesson.(VALID)
      Given user login as a Vice Dean
      And User clicks on the "Lesson Program" button
      And User sees all the details on the "Lesson Program Assignment" list
      And User chooses lesson(s) from the provided list
      And User selects a teacher from dropdown list
      Then User clicks on the "Submit" button







