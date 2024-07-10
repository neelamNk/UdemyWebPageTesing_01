package com.testcases.udemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Base.Udemy.Base;

public class Sign_upTest extends Base {
@Test
	public void  sigupButton() throws InterruptedException  {
		            // Click on the Sign Up button to navigate to the sign-up page
		            WebElement signUpButton = driver.findElement(By.linkText("Sign up"));
		            signUpButton.click();

		            // Wait for the sign-up form to load (you might need to add explicit wait here)
                 Thread.sleep(2000);

		            // Locate and fill the sign-up form fields
		            WebElement nameField = driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/main/div/div/form/div[1]"));
		            Thread.sleep(5000);
		            nameField.sendKeys("Neelam-Kushwaha");
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            WebElement nameFields = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='udemy']/div[1]/div[2]/div/main/div/div/form/div[1]")));
		            nameFields.sendKeys("Neelam-Kushwaha");
		            
		            WebElement emailField = driver.findElement(By.name("email"));
		            WebElement passwordField = driver.findElement(By.name("password"));
		            WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

		            // Fill the form
		      
		            emailField.sendKeys("neelameKw24@gmail.com");
		            passwordField.sendKeys("nick@345");

		            // Submit the form
		            submitButton.click();


}

}
