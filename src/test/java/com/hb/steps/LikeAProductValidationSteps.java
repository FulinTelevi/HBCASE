package com.hb.steps;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hb.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LikeAProductValidationSteps extends CommonMethods {

	@When("User clicks the Like button on the selected product page")
	public void user_clicks_the_like_button_on_the_selected_product_page() {

		switchToWindow();
		wait(10);

		String likedButtonText = productDetailsPage.likeButton.getText();
		
		if(likedButtonText.equals("Beğen")) {
			
		click(productDetailsPage.likeButton);
		wait(1);
		takeScreenShot("LikedProduct");
		
		}else {
			takeScreenShot("ProductAlreadyLiked");
			driver.quit();
		}

		

	}

}
