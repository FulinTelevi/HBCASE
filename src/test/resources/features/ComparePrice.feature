Feature: Adding a Product To The Cart Functionality

  Background: 
    Given user navigates to hepsiburada.com
    When user moves the mouse to the sign in option and clicks on the sign in  from the options
    And User logins with valid username and password
    And user searches one of popular products and selects random product from products list

  @smoke5
  Scenario: Adding a Product To The Cart
    And User verifies product price and add the product to the cart and verifies that product orginal price is equal to product basket price
   
