package com.hb.steps;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.hb.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductEvaluationSteps extends CommonMethods {

	@When("user searches one of popular products and selects random product from products list")
	public void user_searches_one_of_popular_products_and_selects_random_product_from_products_list() {

		click(mainPage.searchBoxInputDiv);
		
		searchAndSelectRandomProduct("iphone 15 pro max");
		wait(2);
	}

	@When("user clicks the reviews tab on the product page and sorts by Newest Reviews")
	public void user_clicks_the_reviews_tab_on_the_product_page_and_sorts_by_newest_reviews() {

		switchToWindow();
		wait(3);
		scrollDown(800);
		wait(5);
		click(productDetailsPage.reviwesTab);
		wait(5);
		click(productDetailsPage.allReviewsTab);
		wait(5);
		scrollDown(800);
		wait(5);
		click(productDetailsPage.sortButton);
		wait(5);
		click(productDetailsPage.newestReviews);
		wait(5);

	}

	@When("user select randomly either Thumbs Up or Thumbs Down")
	public void user_select_randomly_either_thumbs_up_or_thumbs_down() {

		scrollDown(450);
		selectRandomEvaluation();
		wait(5);
		
	}

	@Then("user check the Thank You Message is displayed")
	public void user_check_the_thank_you_message_is_displayed() {

		scrollDown(300);

		Assert.assertTrue(checkThankYouMessage());
		wait(1);
	}

}
