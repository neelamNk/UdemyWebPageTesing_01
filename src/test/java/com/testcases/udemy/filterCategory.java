package com.testcases.udemy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Base.Udemy.Base;

public class filterCategory  extends Base{

	@Test
	public void filterCategoryCourse() {
		driver.findElement(By.xpath("//*[@id=\"main-content-anchor\"]/div/div/div[1]/div/div/div/div/div")).click();
		
	}
}
