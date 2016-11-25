package com.selendroid.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selendroid.locators.PageLocators;

import io.appium.java_client.android.AndroidDriver;

public class Page1 {

	public static void clickToAddUser(AndroidDriver driver)
			throws InterruptedException {
		try {
			List<WebElement> list = driver.findElements(By
					.className(PageLocators.getFileButton));
			list.get(1).click();
			Thread.sleep(2000);

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
