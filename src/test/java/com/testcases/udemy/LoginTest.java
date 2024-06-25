package com.testcases.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Base.Udemy.Base;

public class LoginTest extends Base {



@Test
public void  Login() {
		
  	WebElement Loginlink = driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[1]/div[3]/div[7]"));
  	Loginlink.click();
  WebElement google = driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/main/div/div/button"));
  google.click();
	}


}
