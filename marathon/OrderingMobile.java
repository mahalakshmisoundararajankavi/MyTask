package com.marathon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class OrderingMobile {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		//Launch Salesforce application https://login.salesforce.com/
		driver.get("https://dev70206.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("g=Sl+bJvA99D");
		driver.findElement(By.id("sysverb_login")).click();
		
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(30);
		//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement allAction = shadow.findElementByXPath("//div[@id='all']");
		allAction.click();
		
		//Shadow sha = new Shadow(driver);
//		WebElement fliter = shadow.findElementByXPath("//input[@id='filter']");
//		Thread.sleep(3000);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		
		WebElement frameElement = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		frameElement.click();
		driver.switchTo().frame(frameElement);
		driver.findElement(By.partialLinkText("Mobiles")).click();
		shadow.setImplicitWait(30);
		
		driver.switchTo().frame(frameElement);
		//driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 6s']")).click();
		shadow.setImplicitWait(10);
		WebElement color = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
		//color.click();
		Select select = new Select(color);
		select.selectByVisibleText("Rose Gold");
		
		//driver.switchTo().frame("gsft_main");
		WebElement storage = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[3]"));
		//storage.click();
		shadow.setImplicitWait(20);
		Select sec = new Select(storage);
		sec.selectByVisibleText("128GB [add $50.00]");
		
		
		driver.findElement(By.id("oi_order_now_button")).click();
		shadow.setImplicitWait(10);
		String text = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println(text);
		//fliter.sendKeys("Service Catalog",Keys.ENTER);
	//	Thread.sleep(3000);
//		Actions bulider = new Actions(driver);
//		bulider.moveToElement(fliter).perform();
//		fliter.click();
		
	}

}
