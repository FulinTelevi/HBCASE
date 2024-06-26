package com.hb.steps;

import org.junit.Assert;

import com.hb.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComparePriceValidationSteps extends CommonMethods {

	private static String actualPrice;

	@When("user verifies product price and add the product to the cart")
	public void user_verifies_product_price_and_add_the_product_to_the_cart() {

		switchToWindow();
		wait(3);

		actualPrice = productDetailsPage.productPrice.getText().trim();
		System.out.println(actualPrice);

		click(productDetailsPage.addToCart);
		wait(5);

		click(productDetailsPage.goToTheCart);
		wait(5);

	}

	@Then("user verifies that product orginal price is equal to product basket price")
	public void user_verifies_that_product_orginal_price_is_equal_to_product_basket_price() {

		System.out.println(actualPrice);

		String cartPrice = myCart.productBasketPrice.getText().trim();
		System.out.println(cartPrice);

		Assert.assertEquals(actualPrice, cartPrice);
		wait(3);

	}

}
