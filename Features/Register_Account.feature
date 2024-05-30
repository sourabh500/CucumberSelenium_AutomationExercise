Feature: Register
  Scenario: Successfully register to the account
    Given User launch chrome browser
    When User opens url "https://automationexercise.com/login"
    Then User click on Signup Login button
    Then User verify New User Signup! is visible
    Then User enters Name as "Sourabh" and Email as "shuklasourabh50@gmail.com"
    And click on Signup button
    Then User verify ENTER ACCOUNT INFORMATION is visible
    Then User enter the details Title as Mr, Password as "Sourabh@1", Date of birth Day as "3", Month as "october", Year as "1997"
    Then User select checkbox Sign up for our newsletter!
    Then User fill details First name as "Sourabh", Last name as "shukla", Company as "Google", Address1 as "Indore", State as "Madhya pradesh", City as "Indore", Zipcode as "487551", Mobile Number as "8959078051"
    And User click Create Account button
    Then User verify that ACCOUNT CREATED! is visible
    Then User click continue button
    Then User Verify that Logged in as username is visible
    And User Click Delete Account button
    Then User Verify that ACCOUNT DELETED! is visible




