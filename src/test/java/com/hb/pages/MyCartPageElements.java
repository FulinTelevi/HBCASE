package com.hb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hb.utils.CommonMethods;

public class MyCartPageElements extends CommonMethods{

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[2]/div[3]/div/div/div[3]/div[1]/div[1]/div[2]")
	public WebElement productBasketPrice;
	
	public MyCartPageElements() {
		PageFactory.initElements(driver, this);
	}
}
