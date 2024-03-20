
Feature: Admin sees Guest User list
  Background:
    Given user goes to "https://managementonschools.com/" homepage
  @US_02_TC01
  Scenario:
    And user clicks Register button
    And enters "Deniz" in the Name input field
    And enters "Ugur" in the Surname input field
    And enters "Istanbul" in the Birth Place input field
    And enters "444-444-4545" in the phone field
    And selects gender female radio button

    And enters "06-07-1977" in the Date Of Birth field
    And enters ssn in the Ssn input field
    And enters "Dugur" in the User Name field
    And enters password in the Password input field
    And clicks Register button
    Then verifies success mesg "Guest User registered."

 @US_02_TC02
    Scenario:
    And clicks on loginIcon
    And enters "AdminBatch197" in the userName input field
    And enters "Batch197+" in password field
    And clicks on Login button
    And clicks on Menu button
    And clicks on guest user on the main menu
    Then verifies name column is visible





#  Feature: google_search
#
#  Background: navigating_to_google
#    Given user is on the google homepage
#
#  @iPhone
#  Scenario: TC_01_iPhone_search
#
#    And user search for iPhone
#    Then verify the result contains iPhone
#    And close the application
#
#  @teapot
#  Scenario: TC_02_teapot_search
#    And user search for porcelain teapot
#    Then verify the result contains porcelain teapot
#    And close the application




