@ui
  Feature:Vice Dean can update lesson info from the Lesson Program List
    Scenario: Vice Dean should be able to update from the Lesson Program List.(VALID)
      Given user login as a Vice Dean
      And User clicks on the "Lesson Program" button
      And User sees "Lesson Program List" details
      And User sees "Lesson" in the Lesson Program List
      And User sees "Day" in the Lesson Program List
      And User sees "Start Time" in the Lesson Program List
      And User sees "Stop Time" in the Lesson Program List
      Then User cannot click on the Update Button










