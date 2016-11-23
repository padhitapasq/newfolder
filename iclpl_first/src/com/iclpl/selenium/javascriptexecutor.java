package com.iclpl.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascriptexecutor {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		String domain = jse.executeScript("return document.domain").toString();
		System.out.println("Domain name is " +  domain);
		
		String URL = jse.executeScript("return document.URL;").toString();
		System.out.println("URL is : " + URL);
		
		String title = jse.executeScript("return document.title;").toString();
		System.out.println("Title of the WebPage is " + title);
	}

}
