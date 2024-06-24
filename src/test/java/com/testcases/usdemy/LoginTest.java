package com.testcases.usdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {


WebDriver driver;
@BeforeClass
public void Browseropen() {
driver = new ChromeDriver();
driver.get("https://www.udemy.com/");
driver.manage().window().maximize();

}
//@Test
public void  Login() {
		
  	WebElement Loginlink = driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[1]/div[3]/div[7]"));
  	Loginlink.click();
  WebElement google = driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/main/div/div/button"));
  google.click();
	}
@Test
public void  Searchbox() {
	WebElement Search = driver.findElement(By.name("q"));
	
	Search	.sendKeys("manual testing");
	Search.submit();
}
@Test
public void filterCategory() {
	driver.findElement(By.xpath("//*[@id=\"main-content-anchor\"]/div/div/div[1]/div/div/div/div/div")).click();
	
}
}
