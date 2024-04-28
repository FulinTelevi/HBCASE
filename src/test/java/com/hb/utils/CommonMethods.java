package com.hb.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hb.testbase.PageInitializer;

public class CommonMethods extends PageInitializer {

	public static void sendText(WebElement element, String text) {

		element.clear();
		element.sendKeys(text);
	}

	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	public void searchAndSelectRandomProduct(String productName) {

		sendText(mainPage.searchBox, productName);
		click(mainPage.searchButton);
		wait(1);

		List<WebElement> productResults = mainPage.productsResult;
		Random rand = new Random();
		WebElement randomProduct = productResults.get(rand.nextInt(productResults.size()));
		randomProduct.click();

	}

	public static void switchToWindow() {

		String mainWindow = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			if (!mainWindow.equals(handle)) {
				driver.switchTo().window(handle);
				break;
			}
		}

	}

	public static JavascriptExecutor getJSObject() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;

	}

	public static void scrollDown(int pixel) {
		getJSObject().executeScript("window.scrollBy(0," + pixel + ")");
	}

	public static void scrollToElement(WebElement element) {
		getJSObject().executeScript("arguments[0].scroll, null)intoView(true)", element);
	}

	public void selectRandomEvaluation() {

		List<WebElement> evaluationButton = productDetailsPage.evaluationButtons;
		Random rand = new Random();
		WebElement randomEvaluationButton = evaluationButton.get(rand.nextInt(evaluationButton.size()));
		click(randomEvaluationButton);
	}

	public boolean checkThankYouMessage() {
		List<WebElement> thankYouMessages = productDetailsPage.thankYouMessages;
		return thankYouMessages.size() > 0;
	}

	public static void movingMouse(WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

	}

	public static WebDriverWait getWaitObject() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
		return wait;

	}

	public static WebElement waitForClickability(WebElement element) {

		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebElement waitForVisibility(WebElement element) {

		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static byte[] takeScreenShot(String fileName) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		String destination = Constants.SCREENSHOT_FILEPATH + fileName + getTimeStamp() + ".png";

		try {
			FileUtils.copyFile(sourceFile, new File(destination));
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte[] pic = ts.getScreenshotAs(OutputType.BYTES);

		return pic;
	}

	public static String getTimeStamp() {
		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");

		return sdf.format(date);
	}

}
