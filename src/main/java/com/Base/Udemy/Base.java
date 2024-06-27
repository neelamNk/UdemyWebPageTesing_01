package com.Base.Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

public static	WebDriver driver;
	@BeforeClass
	public void Browseropen() {
	driver = new ChromeDriver();
	driver.get("https://www.udemy.com/");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());

	}
	@AfterClass
	public void closebrowser() {
		driver.close();
	}
	}

