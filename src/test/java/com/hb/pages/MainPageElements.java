package com.hb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hb.utils.CommonMethods;

public class MainPageElements extends CommonMethods{

	@FindBy(id = "myAccount")
	public WebElement loginOptions;
	
	@FindBy(id = "login")
	public WebElement login;
	
	@FindBy(xpath= "//*[@id='root']/div/div/div[1]/div[2]/div/div")
	public WebElement informationBox;
	
	public MainPageElements() {
		PageFactory.initElements(driver, this);
	}
}
