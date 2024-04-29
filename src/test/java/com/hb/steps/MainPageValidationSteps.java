package com.hb.steps;

import org.junit.Assert;

import com.hb.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainPageValidationSteps extends CommonMethods {

	@Given("user navigates to hepsiburada.com")
	public void user_navigates_to_hepsiburada_com() {

		waitForVisibility(mainPage.cookieAcceptButton);
		click(mainPage.cookieAcceptButton);
		wait(2);

		String expectedTitle = "Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com";
		String actualTitle = driver.getTitle().trim();
		Assert.assertEquals(expectedTitle.trim(), actualTitle);

	}

}
