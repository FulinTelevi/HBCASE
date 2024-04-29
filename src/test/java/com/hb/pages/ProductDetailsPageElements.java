package com.hb.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hb.utils.CommonMethods;

public class ProductDetailsPageElements extends CommonMethods {

	@FindBy(css = "span.rating-star")
	public WebElement ratingStar;
	
	@FindBy(xpath = "//table[@id='css-tab-buttons']/tbody/tr/td[3]/a")
	public WebElement reviwesTab;

	@FindBy(xpath = "//a[contains(text(),'Tüm değerlendirmeler')]")
	public WebElement allReviewsTab;

	@FindBy(xpath = "//div[contains(text(),'Varsayılan')]")
	public WebElement sortButton;

	@FindBy(xpath = "//div[contains(text(),'En yeni değerlendirme')]")
	public WebElement newestReviews;

	@FindBy(xpath = "//div[@class='paginationContentHolder']//div[contains(@class,'thumbsUp')]")
	public List<WebElement> thumsUpButtons;

	@FindBy(xpath = "//div[@class='paginationContentHolder']//div[contains(@class,'thumbsDown')]")
	public List<WebElement> thumbsDownButtons;

	@FindBy(xpath = "//div[@class='paginationContentHolder']//div[contains(@class,'thumbsUp')] | //div[@class='paginationContentHolder']//div[contains(@class,'thumbsDown')]")
	public List<WebElement> evaluationButtons;

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	public WebElement acceptCookies;

	@FindBy(xpath = "//span[contains(text(),'Teşekkür Ederiz.')]")
	public List<WebElement> thankYouMessages;

	@FindBy(xpath = "//div[@id='favoriteContainer']//div//div//div[1]//div//div//div//div[contains(text(),'Beğen')]")
	public WebElement likeButton;

	@FindBy(xpath = "//span[@id='offering-price']")
	public WebElement productPrice;

	@FindBy(xpath = "//button[@id = 'addToCart']")
	public WebElement addToCart;
	
	@FindBy(xpath = "//button[contains(text(),'Sepete git')]")
	public WebElement goToTheCart;

	public ProductDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}

}
