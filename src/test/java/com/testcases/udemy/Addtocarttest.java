package com.testcases.udemy;
   import java.io.File;
	import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;
	import com.Base.Udemy.Base;

	public class Addtocarttest  extends Base {

	    @Test
	    public void Searchbox() throws InterruptedException, IOException {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

	        // Search for a course
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("manual testing");
	        searchBox.submit();

	        // Wait for search results to load
	        Thread.sleep(1000);

	        // Take a screenshot
	        TakesScreenshot tS = (TakesScreenshot) driver;
	        File srcFile = tS.getScreenshotAs(OutputType.FILE);
	        File destFile = new File("./ClickCode/Course.png");
	        FileUtils.copyFile(srcFile, destFile);

	        // Click on the course image
	        WebElement courseImg = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='popper-module--popper--mM5Ie ud-popper-open']")));
	        courseImg.click();

	        // Wait for the course page to load and add to cart
	        Thread.sleep(1000);
	        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='u261-tabs--71-content-0']/div/div[1]/div[1]/div/div[4]/div/button")));
	        addToCart.click();

	        // Go to cart
	        WebElement goToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='udemy']/div[14]/div/div[2]/div[2]/div[1]/div/button")));
	        goToCart.click();

	        // Checkout
	        WebElement checkout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='udemy']/div[1]/div[2]/div/div/div[3]/div[2]/div/div[2]")));
	        checkout.click();

	        // Select state
	        WebElement stateUnionTerritory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='udemy']/div[1]/div[2]/div/div/div/main/section[1]/div[1]/div[2]/div")));
	        stateUnionTerritory.click();
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("window.scrollBy(0,350)", "");
	        Select select = new Select(stateUnionTerritory);
	        select.selectByValue("Maharashtra");

	        // Payment method
	        WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='u94-accordion-panel-title--9']/span")));
	        radioButton.click();

	        // Enter card details
	        WebElement cardholderName = driver.findElement(By.className("holderName"));
	        cardholderName.sendKeys("Nick");
	        WebElement cardNumber = driver.findElement(By.id("adyen-checkout-encryptedCardNumber-1719308531352"));
	        cardNumber.sendKeys("3425562256612");
	        WebElement expiryDate = driver.findElement(By.id("adyen-checkout-encryptedExpiryDate-1719308531353"));
	        expiryDate.sendKeys("05/26");
	        WebElement cvcCVV = driver.findElement(By.id("adyen-checkout-encryptedSecurityCode-1719308531354"));
	        cvcCVV.sendKeys("567");

	        // Securely save this card for my later purchase
	        WebElement checkbox = driver.findElement(By.id("u94-checkbox--10"));
	        checkbox.click();

	        // Summary
	        driver.findElement(By.xpath("//*[@id='udemy']/div[1]/div[2]/div/div/div/aside/div/div/div[2]/div[2]")).click();
	    }
	}

