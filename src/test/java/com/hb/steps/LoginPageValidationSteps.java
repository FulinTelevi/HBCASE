package com.hb.steps;

import org.junit.Assert;

import com.hb.utils.CommonMethods;
import com.hb.utils.ConfigsReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageValidationSteps extends CommonMethods {

	@When("user moves the mouse to the sign in option and clicks on the sign in  from the options")
	public void user_moves_the_mouse_to_the_sign_in_option_and_clicks_on_the_sign_in_from_the_options() {
		
		movingMouse(mainPage.loginOptions);
		wait(1);
		click(mainPage.login);
		wait(1);
	}

	@When("user verifies that he\\/she is on the login page")
	public void user_verifies_that_he_she_is_on_the_login_page() {	    
		
		String expectedTitle="Üye Giriş Sayfası & Üye Ol - Hepsiburada";
		String actualTitle = driver.getTitle().trim();
		wait(1);
		
		Assert.assertEquals(expectedTitle.trim(),actualTitle);
		
	}

	@And("User logins with valid username and password")
	public void user_logins_with_valid_username_and_password() {
	    
		/*sendText(loginPage.userNameBox,ConfigsReader.getProperty("username"));
		wait(1);
		sendText(loginPage.passwordBox,ConfigsReader.getProperty("password"));
		wait(1);
		click(loginPage.loginButton);
		wait(1);
		*/
		
		click(loginPage.loginWithFacebook);
		wait(1);
		sendText(loginPage.fbEmail,ConfigsReader.getProperty("fbusername"));
		wait(1);
		sendText(loginPage.fbPass,ConfigsReader.getProperty("fbpassword"));
		wait(1);
		click(loginPage.fbLogin);
		wait(1);
		
	}
	
	@Then("User validates succesfully logged in")
	public void user_validates_succesfully_logged_in() {
	    
		//Assert.assertTrue(homePage.checkAccountName.getText().contains("Fulin Televi"));
		
		Assert.assertTrue(homePage.checkAccountName.getText().contains("Beykan Televi"));
		wait(1);
	}

}
