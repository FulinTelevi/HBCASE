
Feature: Product Evaluation Functionality

		Background:
			Given user navigates to hepsiburada.com 
			
  @smoke3
  Scenario: Select Thumbs Up or Thumbs Down and  Check Thank You Message
    When user searches one of popular products and selects random product from products list 
    And user clicks the reviews tab on the product page and sorts by Newest Reviews
    And user select randomly either Thumbs Up or Thumbs Down
    Then user check the Thank You Message is displayed
    
  