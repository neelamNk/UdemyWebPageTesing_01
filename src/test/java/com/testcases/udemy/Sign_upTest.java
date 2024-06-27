package com.testcases.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Base.Udemy.Base;

public class Sign_upTest extends Base {
@Test
	public void  sigupButton() throws InterruptedException {
		            // Click on the Sign Up button to navigate to the sign-up page
		            WebElement signUpButton = driver.findElement(By.linkText("Sign up"));
		            signUpButton.click();

		            // Wait for the sign-up form to load (you might need to add explicit wait here)
                 Thread.sleep(2000);

		            // Locate and fill the sign-up form fields
		            WebElement nameField = driver.findElement(By.name("fullname"));
		            WebElement emailField = driver.findElement(By.name("email"));
		            WebElement passwordField = driver.findElement(By.name("password"));
		            WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

		            // Fill the form
		            nameField.sendKeys("Neelam-Kushwaha");
		            emailField.sendKeys("neelameKw24@gmail.com");
		            passwordField.sendKeys("nick@345");

		            // Submit the form
		            submitButton.click();


}

}
