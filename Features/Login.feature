Feature: Login
  Scenario: Successfully login to account with valid credentials
    Given User launch chrome browser
    When User opens url "https://automationexercise.com/login"
    Then User click on Signup Login button
    Then User Verify Login to your account is visible
    Then User Enter email address as "shuklasourabh50@gmail.com" and password as "Sourabh@1"
    Then User Click login button
    Then User Verify that Logged in as username is visible


Scenario: Successfully logout from the account
  Given User launch chrome browser
  When User opens url "https://automationexercise.com/login"
  Then User click on Signup Login button
  Then User Verify Login to your account is visible
  Then User Enter email address as "shuklasourabh50@gmail.com" and password as "Sourabh@1"
  Then User Click login button
  Then User Verify that Logged in as username is visible
  Then User click on Logout button
  Then User Verify Login to your account is visible

