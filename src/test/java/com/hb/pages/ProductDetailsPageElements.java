package com.hb.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hb.utils.CommonMethods;

public class ProductDetailsPageElements extends CommonMethods {

	@FindBy(xpath = "//table[@id='css-tab-buttons']/tbody/tr/td[3]/a")
	public WebElement reviwesTab;

	@FindBy(xpath = "//a[contains(text(),'Tüm değerlendirmeler')]")
	public WebElement allReviewsTab;

	@FindBy(xpath = "//div[contains(text(),'Varsayılan')]")
	public WebElement sortButton;

	@FindBy(xpath = "//div[contains(text(),'En yeni değerlendirme')]")
	public WebElement newestReviews;

	@FindBy(xpath = "//div[@id='hermes-voltran-comments']/div[6]/div[3]/div[1]/div/div[2]/div[5]/div/div/div/div[1]/div")
	public List<WebElement> evaluationButtons;

	@FindBy(xpath = "//span[contains(text(),'Teşekkür Ederiz.')]")
	public List<WebElement> thankYouMessages;

	public ProductDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}
}
