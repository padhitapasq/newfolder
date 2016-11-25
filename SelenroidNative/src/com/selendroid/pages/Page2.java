package com.selendroid.pages;

import io.appium.java_client.android.AndroidDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selendroid.locators.PageLocators;
import com.selendroid.utils.readData;

public class Page2 {

	public static void createUser(String path, String sheet,
			AndroidDriver driver) {

		try {
			readData.setPath(path, sheet);

			List<WebElement> fillDetailsList = driver.findElements(By
					.className(PageLocators.getTextFields));
			fillDetailsList.get(0).sendKeys(readData.getData(0, 1));
			fillDetailsList.get(1).sendKeys(readData.getData(1, 1));
			fillDetailsList.get(2).sendKeys(readData.getData(2, 1));
			fillDetailsList.get(3).clear();
			fillDetailsList.get(3).sendKeys(readData.getData(3, 1));

			driver.findElement(By.className(PageLocators.programmingLanguage))
					.click();

			List<WebElement> selectALanguage = driver.findElements(By
					.className(PageLocators.selectLanguage));
			selectALanguage.get(5).click();
			
			driver.hideKeyboard();
			
			driver.findElement(By.className(PageLocators.checkBox)).click();
			driver.findElement(By.className(PageLocators.submitButton)).click();

			driver.findElement(By.className(PageLocators.submitButton)).click();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
