package com.Base.Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Base {

public static	WebDriver driver;
	@BeforeClass
	public void Browseropen() {
	driver = new ChromeDriver();
	driver.get("https://www.udemy.com/");
	driver.manage().window().maximize();

	}
}
