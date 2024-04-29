Feature: Login Page Functionality

  Background: 
    Given user navigates to hepsiburada.com

  @smoke2
  Scenario: Login Page Validation
  	When user moves the mouse to the sign in option and clicks on the sign in  from the options
    And user verifies that he/she is on the login page
    And User logins with valid username and password
    Then User validates succesfully logged in
