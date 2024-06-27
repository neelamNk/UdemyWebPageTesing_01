package com.testcases.udemy;

import java.awt.Checkbox;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Base.Udemy.Base;

public class Addtocarttest extends Base {

	@Test
	public void Searchbox() throws InterruptedException, IOException {
		WebElement Search = driver.findElement(By.name("q"));

		Search.sendKeys("manual testing");
		Search.submit();
		Thread.sleep(1000);
		TakesScreenshot tS = (TakesScreenshot) driver;
		File SrcFile = tS.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./ClickCode/Course.png");
		FileUtils.copyFile(SrcFile, DestFile);
		WebElement CourseImg = driver
				.findElement(By.xpath("//div[@class=\"popper-module--popper--mM5Ie ud-popper-open\"]"));
		CourseImg.click();
		Thread.sleep(1000);
		WebElement addtocard = driver
				.findElement(By.xpath("//*[@id=\"u261-tabs--71-content-0\"]/div/div[1]/div[1]/div/div[4]/div/button"));
		addtocard.click();
		WebElement GotoCard = driver
				.findElement(By.xpath("//*[@id=\"udemy\"]/div[14]/div/div[2]/div[2]/div[1]/div/button"));
		GotoCard.click();
		
		WebElement Checkout = driver
				.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/div/div[3]/div[2]/div/div[2]"));
		Checkout.click();
		//
		WebElement StateUnionTerritory = driver.findElement(
				By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/div/div/main/section[1]/div[1]/div[2]/div"));
		StateUnionTerritory.click();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(0,350)", "");
		Select select = new Select(StateUnionTerritory);
		select.selectByValue("Maharashtra");
		// Payment method
		WebElement rediobutton = driver.findElement(By.xpath("//*[@id=\"u94-accordion-panel-title--9\"]/span"));
		rediobutton.click();
		// Name on card
		WebElement CardholderName = driver.findElement(By.className("holderName"));
		CardholderName.sendKeys("Nick");
		WebElement Cardnumber = driver.findElement(By.id("adyen-checkout-encryptedCardNumber-1719308531352"));
		Cardnumber.sendKeys("3425562256612");
		WebElement Expirydate = driver.findElement(By.id("adyen-checkout-encryptedExpiryDate-1719308531353"));
		Expirydate.sendKeys("05/26");
		WebElement CVC_CVV = driver.findElement(By.id("adyen-checkout-encryptedSecurityCode-1719308531354"));
		CVC_CVV.sendKeys("567");
		// Securely save this card for my later purchase
		WebElement checkbox = driver.findElement(By.id("u94-checkbox--10"));
		rediobutton.click();
		// Summary

		driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/div/div/aside/div/div/div[2]/div[2]"))
				.click();
	}

}
