package com.testcases.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Base.Udemy.Base;

public class Sign_upTest extends Base {
@Test
	public void  sigupButton() throws InterruptedException  {
		            // Click on the Sign Up button to navigate to the sign-up page
		            WebElement signUpButton = driver.findElement(By.linkText("Sign up"));
		            signUpButton.click();
		            Thread.sleep(2000);
		            WebElement fullname = driver.findElement(By.id("form-group--1"));
		            fullname.sendKeys("neelam kushwaha");
		            Thread.sleep(2000);
		            WebElement emailField = driver.findElement(By.name("email"));
		            emailField.sendKeys("neelameKw24@gmail.com");
		            Thread.sleep(2000);
		            WebElement passwordField = driver.findElement(By.name("password"));
		            passwordField.sendKeys("nick@345");
		            Thread.sleep(2000);
		            WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/main/div/div/form/div[6]"));
		            submitButton.click();
		 
}

}
