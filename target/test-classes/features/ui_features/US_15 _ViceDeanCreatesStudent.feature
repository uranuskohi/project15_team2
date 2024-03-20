@US_15_UI
  Feature: Vice dean should be able to create student

    Background: Sign in as a vice dean
      Given user goes to "https://managementonschools.com/" homepage
      And clicks on loginIcon
      And enters "ViceDeanEsra" in the userName input field
      And enters "ViceDeanEsra123" in the password input field
      And clicks on Login button
      And clicks on Menu button
      And clicks on "Student Management" on Main Menu


    @US_15_TC_01
    Scenario: Vice dean should be able to create Student successfully
      Given vice dean chooses "Teacher Tarik" in the advisor teacher dropdown
      And enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",ssn "ssn",username "username",fathername "fathername",mothername "mothername",password "password"
      And selects "Male" radio button
      Then vice dean clicks submit button
      Then verify student is created successfully message
      Then verify student snn  appear in the student list
      And close the application

    @US_15_TC_02
      Scenario: Vice dean should NOT be able to create Student with invalid SSN number and phone number
        Given vice dean chooses "Teacher Tarik" in the advisor teacher dropdown
        And enters name "name",surname "surname",birthplace "birth place",email "email",invalid phone "invalidPhone",dateofbirth "dateofbirth",invalid ssn "invalidSsn",username "username",fathername "fathername",mothername "mothername",password "password"
        And selects "Female" radio button
        Then vice dean clicks submit button
        Then verify invalid phone and invalid ssn  message
        Then verify student snn  appear in the student list
        And close the application



