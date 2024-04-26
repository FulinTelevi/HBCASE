Feature: Login Page Functionality

  Background: 
    Given user navigates to hepsiburada.com
    When user moves the mouse to the sign in option and clicks on the sign in  from the options

  @smoke2
  Scenario: Login Page Validation
    And User logins with valid username and password
    Then User validates succesfully logged in
