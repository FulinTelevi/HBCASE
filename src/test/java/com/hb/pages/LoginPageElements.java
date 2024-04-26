package com.hb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hb.utils.CommonMethods;

public class LoginPageElements extends CommonMethods {

	@FindBy(id = "txtUserName")
	public WebElement userNameBox;
	
	@FindBy(id = "txtPassword")
	public WebElement passwordBox;
	
	@FindBy(id = "btnLogin")
	public WebElement loginButton;
	
	public LoginPageElements() {
		PageFactory.initElements(driver, this);
	}
	
}