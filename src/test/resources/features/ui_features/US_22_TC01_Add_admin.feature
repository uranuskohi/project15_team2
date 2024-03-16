@us_22_addAdmin
  Feature:
    Background:
      Given admin goes to "https://managementonschools.com/" homepage
      And admin clicks on loginIcon
      And enters "AdminBatch197" in the User Name input field
      And enters "Batch197+" in the Password input field
      And clicks on Login button

    Scenario:TC_01 Add admin
      When admin enters "Ashley" in the Name field
      And admin enters "Smith" in the Surname field
      And enters "Istanbul" in the Birth Place input field
      And enters phone in the phone field
      And selects gender in the Gender radio button
      And selects date of birth in date of birth field
      And enters "505-446-4646" in the phone field
      And enters "440-40-4040" in the Ssn input field
      And enters "Asmith" in the User Name field
      And enters "Asmith12" in the Password input field
      And clicks on Submit button
      Then verify success message "Admin Saved"


    Scenario: TC_02 Admin shouldn't be added when Name box left empty
      When admin leaves blank Name field
      And admin enters "Smith" in the Surname field
      And enters "Istanbul" in the Birth Place input field
      And enters phone in the phone field
      And selects gender in the Gender radio button
      And selects date of birth in date of birth field
      And enters "505-446-4646" in the phone field
      And enters "440-40-4040" in the Ssn input field
      And enters "Asmith" in the User Name field
      And enters "Asmith12" in the Password input field
      And clicks on Submit button
      Then verify message "Required" under Name box
