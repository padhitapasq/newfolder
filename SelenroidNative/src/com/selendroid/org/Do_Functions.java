package com.selendroid.org;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.selendroid.locators.PageLocators;
import com.selendroid.pages.Page1;
import com.selendroid.pages.Page2;

public class Do_Functions {

	static AndroidDriver driver;

	public static void doSetup() throws MalformedURLException {
		DesiredCapabilities capability = new DesiredCapabilities();

		capability.setCapability(CapabilityType.BROWSER_NAME, "");
		capability.setCapability("platformName", "Android");
		capability.setCapability("platformVersion", "4.2.2");
		capability.setCapability("deviceName", "Emulator");

		capability.setCapability("appPackage", "io.selendroid.testapp");
		capability.setCapability("appActivity", ".HomeScreenActivity");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capability);

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}

	public static void doOperation() throws InterruptedException {
		Page1.clickToAddUser(driver);
		Page2.createUser(PageLocators.excelPath, "Sheet1", driver);

	}

	public static void doCloseApp() {
		driver.quit();

	}

}
