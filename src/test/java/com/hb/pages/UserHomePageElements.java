package com.hb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hb.utils.CommonMethods;

public class UserHomePageElements extends CommonMethods {

	@FindBy(xpath = "//div[@id='myAccount']/span/a/span[2]")
	public WebElement checkAccountName;
	
	@FindBy(xpath = "//div[@id= 'react-autowhatever-1']//parent::div/input")
	public WebElement searchBox;

	@FindBy(xpath = "//div[contains(text(),'ARA')]")
	public WebElement searchButton;
	
	@FindBy(id = "myAccount")
	public WebElement myAccountOptions;
	
	@FindBy(xpath = "//*[@id='myAccount']/div/div/ul/li[7]")
	public WebElement myLikesButton;
	
	
	
	public UserHomePageElements() {
		PageFactory.initElements(driver, this);
	}
}
