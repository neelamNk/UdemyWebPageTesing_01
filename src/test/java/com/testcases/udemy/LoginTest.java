package com.testcases.udemy;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Base.Udemy.Base;

public class LoginTest extends Base {



@Test
public void  Login() throws InterruptedException {
		Thread.sleep(4000);
  	WebElement Loginlink = driver.findElement(By.xpath("//*[@class=\"ud-btn ud-btn-medium ud-btn-secondary ud-heading-sm\"]"));
  	Loginlink.click();
  	Thread.sleep(4000);
  WebElement FullName = driver.findElement(By.id("form-group--1"));
  FullName.sendKeys("neelamkw24@gmail.com");
  Thread.sleep(4000);
  WebElement   password = driver.findElement(By.name("password"));
  Thread.sleep(4000);
  password.sendKeys("Nick@345");
   WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/main/div/div/div[2]/form/button"));
   loginbutton.click();
   
	}
@Test
public void ForrgetPassword() {
	//https://www.udemy.com/user/forgot-password/
	
WebElement  link=	driver.findElement(By.linkText("Forgot Password"));
link.click();
WebElement EmailChange = driver.findElement(By.id("form-group--1"));
EmailChange.sendKeys("abc@134gmail.com");
 WebElement ResetpasswordPasswordlink = driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/main/div/div/form/div[2]/button"));
  Assert.assertEquals(driver.findElements(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/main/div/div/div/div/div/div/h2")), "Reset password email sent");


}

}
