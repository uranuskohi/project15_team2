@US_22_DB
Feature: User adds Admin
  Background:
    Given user goes to "https://managementonschools.com/" homepage
    And user login as Admin

  Scenario Outline:US_22_TC01 Creating Admin successfully with right credentials
    When enters name "<name>", surname "<surname>",birth_place "<birth_place>", phone_number "<phone_number>",gender "<gender>", date_of_birth "<date_of_birth>",ssn "<ssn>",username "<username>",password "<password>"
    And clicks on submit button


    Examples:
      | name   | surname | birth_place | phone_number | gender | date_of_birth | ssn         | username | password |
      | Ashley | Smith   | Istanbul    | 444-444-4646 | 1      | 05/10/1977    | 440-40-4040 | Asmith   | Asmith12 |
#
#  Scenario Outline: US_22_TC02 Validating created Admin
#      Given user connects to application database
#      When user gets admins username via username "<username>"
#      Then verify body contains gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", username "<username>"
#
#    Examples:
#      | name   | gender | phone_number | ssn         | username |
#      | Ashley | 1      | 444-444-4646 | 440-40-4040 | Asmith   |
