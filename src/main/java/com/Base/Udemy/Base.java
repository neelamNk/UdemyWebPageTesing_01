package com.Base.Udemy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Base {

public static	WebDriver driver;
Properties p ;
	@BeforeClass
	public void setup() throws IOException {
	//	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
       FileInputStream files  =  new FileInputStream("./src/test/resources/confgi.properties");
       p = new  Properties();
       p.load(files);
       p.getProperty("Browser");
  
	}
	
	@Test
	public void UrlLaunching() throws InterruptedException {
		//driver.get("https://www.udemy.com/");
	     p.getProperty("Url");
        Thread.sleep(60000);
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


