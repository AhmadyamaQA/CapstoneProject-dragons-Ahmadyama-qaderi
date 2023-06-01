Feature: Retail Signin Feature

  @signInTest
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click On Signin  option
    And User enter email 'John01@gmail.com' and password 'John123@'
    And User click on login button
    Then User should be logged in into Account

  @CreateAccount
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in  option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email               | password  | confirmPassword |
      | dragoon | JohmSmit@gmail.com | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page
