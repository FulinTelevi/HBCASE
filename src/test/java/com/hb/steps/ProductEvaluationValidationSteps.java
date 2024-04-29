package com.hb.steps;

import org.junit.Assert;

import com.hb.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductEvaluationValidationSteps extends CommonMethods {

	@When("user searches one of popular products and selects random product from products list")
	public void user_searches_one_of_popular_products_and_selects_random_product_from_products_list() {

		
		
		click(mainPage.searchBoxInputDiv);

		searchAndSelectRandomProduct("iphone 15 pro max");
		wait(5);
	}

	@When("user clicks the reviews tab on the product page and sorts by Newest Reviews")
	public void user_clicks_the_reviews_tab_on_the_product_page_and_sorts_by_newest_reviews() {

		switchToWindow();
		wait(5);

		scrollToElement(productDetailsPage.reviwesTab);

		if (productDetailsPage.ratingStar.isDisplayed()) {
			click(productDetailsPage.reviwesTab);
		} else {
			driver.quit();
		}

		click(productDetailsPage.sortButton);
		wait(5);
		click(productDetailsPage.newestReviews);
		wait(5);

	}

	@When("user select randomly either Thumbs Up or Thumbs Down")
	public void user_select_randomly_either_thumbs_up_or_thumbs_down() {

		//click(productDetailsPage.acceptCookies);
		
		selectRandomEvaluation();
		wait(10);
		
		takeScreenShot("verifyThankYouMessage");

	}

	@Then("user check the Thank You Message is displayed")
	public void user_check_the_thank_you_message_is_displayed() {

		Assert.assertTrue(checkThankYouMessage());
		wait(5);
	}

}
