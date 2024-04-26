package com.hb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hb.utils.CommonMethods;

public class UserHomePageElements extends CommonMethods {

	@FindBy(xpath = "//div[@id='myAccount']/span/a/span[2]")
	public WebElement myAccount;
	
	@FindBy(xpath = "//div[@id='SearchBoxOld_bdfa4e35-3f5a-447d-92db-3179ae226811']/div[1]/div[1]//following-sibling::div/input")
	public WebElement searchbox;

	@FindBy(xpath = "//div[@id='SearchBoxOld_bdfa4e35-3f5a-447d-92db-3179ae226811']/div/div/div[2]")
	public WebElement searchButton;
	
	public UserHomePageElements() {
		PageFactory.initElements(driver, this);
	}
}
