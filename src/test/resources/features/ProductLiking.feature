Feature: Product Liking Functionality

  Background: 
    Given user navigates to hepsiburada.com
    When user moves the mouse to the sign in option and clicks on the sign in  from the options
    And User logins with valid username and password
    And user searches one of popular products and selects random product from products list

  @smoke4
  Scenario: Liking a Product
    And User clicks the Like button on the selected product page
    
