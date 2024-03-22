@userStory05 @sloane

Feature:Admin should be able to see and delete Dean
  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And clicks on loginIcon
    And enters "AdminBatch197" in the userName input field
    And enters "Batch197+" in the password input field
    And clicks on Login button
    And clicks on Menu button
    And clicks on "Dean Management" on Main Menu



  Scenario Outline: See and Delete Dean successfully, when signed in as Admin
    When Admin sees the new Deans Name "<New Deans Name>"
    And Admin can delete new Dean
#    Then verify new Dean is now not there
    Examples:
      | New Deans Name |
      | Janee |


#    delete button does not exist, it is a known bug on Jira