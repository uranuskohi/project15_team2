@DB_US_02
Feature: Admin should be able to see the guest user
  Background:
    Given user goes to "https://managementonschools.com/" homepage

  Scenario Outline:TC_01_Registration
    Given user clicks Register button
    When Enter name "<name>", surname "<surname>",birth_place "<birth_place>", phone_number "<phone_number>",gender "<gender>", date_of_birth "<date_of_birth>",ssn "<ssn>",username "<username>",password "<password>"
    Then click on register button
    Examples:
      | name  | surname | birth_place | phone_number | gender | date_of_birth | ssn         | username | password |
      | Deniz | Ugur    | Istanbul    | 444-444-4545 | Female | 06-07-1977    | 444-44-4545 | Dugur    | Dugur123 |


  Scenario Outline: TC_02_GuestUser
    Given user connects to application database
    When user gets guest user via username "<username>"
    Then body contains gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", username "<username>"

    Examples:
      | name  | gender | phone_number | ssn         | username |
      | Deniz | 1      | 444-444-4545 | 444-44-4545 | Dugur    |
