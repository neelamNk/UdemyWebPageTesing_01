package com.testcases.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Base.Udemy.Base;


public class filterCategorytest  extends Base{

	@Test
	public void filterCategoryCourse() throws InterruptedException {
		WebElement Search = driver.findElement(By.name("q"));

		Search.sendKeys("manual testing");
		Search.submit();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"blYgG5\"]/div/label/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"main-content-anchor\"]/div/div/div[1]/div/div/div/div/div")).click();
		//Rating
	WebElement RedioButton = driver.findElement(By.id("u99-radio--260"));
	RedioButton.click();
	//Lagaluge
	WebElement CheckBox = driver.findElement(By.xpath("//*[@id=\"filter-form\"]/div/div[2]/div[2]/div/div/div/div/div/label[1]/input[1]"));
	CheckBox.click();
	}
}
