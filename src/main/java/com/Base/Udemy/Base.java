package com.Base.Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Base {

public static	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	driver = new FirefoxDriver();
	}
	
	@Test
	public void UrlLaunching() {
		driver.get("https://www.udemy.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
	}
	@AfterClass
	public void closeBrowser() {

		if (driver != null) {
            //driver.close();
        }
	}
	}


