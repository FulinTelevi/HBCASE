package com.hb.steps;

import org.junit.Assert;

import com.hb.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainPageValidationSteps extends CommonMethods {

	@When("user navigate to hepsiburada.com and verify title of website")
	public void user_navigate_to_hepsiburada_com_and_verify_title_of_website() {

		waitForVisibility(mainPage.loginOptions);
		
		String expectedTitle = "Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@When("user moves the mouse to the sign in option and clicks on the sign in  from the options")
	public void user_moves_the_mouse_to_the_sign_in_option_and_clicks_on_the_sign_in_from_the_options() {

		movingMouse(mainPage.loginOptions);
		wait(1);
		click(mainPage.login);
		wait(1);
	}

	@Then("user validates title of sign in page")
	public void user_validates_title_of_sign_in_page() {

		waitForVisibility(mainPage.informationBox);
		
		String expectedTitle = "Üye Giriş Sayfası & Üye Ol - Hepsiburada";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(expectedTitle, actualTitle);
	}
}
