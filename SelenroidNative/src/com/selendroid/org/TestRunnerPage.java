package com.selendroid.org;

import java.net.MalformedURLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRunnerPage {

	@BeforeTest
	public static void setCapability() throws MalformedURLException {
		Do_Functions.doSetup();
	}

	@Test
	public static void doOperations() throws InterruptedException {
		Do_Functions.doOperation();

	}

	@AfterTest
	public static void quitApp() {
		Do_Functions.doCloseApp();
	}
}
