package com.hb.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hb.utils.CommonMethods;

public class MainPageElements extends CommonMethods{

	@FindBy(id = "myAccount")
	public WebElement loginOptions;
	
	@FindBy(id = "login")
	public WebElement login;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[4]/div[5]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div/div/div")
	public WebElement searchBoxInputDiv;
	
	@FindBy(css = "input.theme-IYtZzqYPto8PhOx3ku3c")
	public WebElement searchBox;
	
	@FindBy(xpath = "//div[contains(text(),'ARA')]")
	public WebElement searchButton;
	
	@FindBy(xpath = "//ul[@id='1']/li")
	public List<WebElement> productsResult;
	
	@FindBy(id = "onetrust-accept-btn-handler")
	public WebElement cookieAcceptButton;
	
	public MainPageElements() {
		PageFactory.initElements(driver, this);
	}
}
