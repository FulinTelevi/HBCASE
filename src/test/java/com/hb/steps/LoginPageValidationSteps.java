package com.hb.steps;

import org.junit.Assert;
import com.hb.utils.CommonMethods;
import com.hb.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageValidationSteps extends CommonMethods {

	@When("User logins with valid username and password")
	public void user_logins_with_valid_username_and_password() {
	    
		sendText(loginPage.userNameBox,ConfigsReader.getProperty("username"));
		wait(1);
		sendText(loginPage.passwordBox,ConfigsReader.getProperty("password"));
		wait(1);
		click(loginPage.loginButton);
		wait(1);
	}
	
	@Then("User validates succesfully logged in")
	public void user_validates_succesfully_logged_in() {
	    
		Assert.assertTrue(homePage.myAccount.getText().contains("Fulin Televi"));
		wait(2);
	}

}
