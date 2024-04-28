package com.hb.testbase;

import com.hb.pages.LoginPageElements;
import com.hb.pages.MainPageElements;
import com.hb.pages.ProductDetailsPageElements;
import com.hb.pages.UserHomePageElements;

public class PageInitializer extends BaseClass {

	public static MainPageElements mainPage;
	public static LoginPageElements loginPage;
	public static UserHomePageElements homePage;
	public static ProductDetailsPageElements productDetailsPage;
	
	public static void initialize() {
		
		mainPage = new MainPageElements();
		loginPage=new LoginPageElements();
		homePage = new UserHomePageElements();
		productDetailsPage = new ProductDetailsPageElements();
	}
}
