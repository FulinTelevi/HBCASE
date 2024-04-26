package com.hb.testbase;

import com.hb.pages.MainPageElements;

public class PageInitializer extends BaseClass {

	public static MainPageElements mainPage;
	
	
	
	public static void initialize() {
		
		mainPage = new MainPageElements();
		
	}
}
