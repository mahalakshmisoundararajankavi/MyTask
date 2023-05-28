package com.marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class AdministratorCertifications {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		//Launch Salesforce application https://login.salesforce.com/
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Login with username as "hari.radhakrishnan@qeagle.com" and password as "Leaf@1234"
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		//driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		//String parentWindowHandle = driver.getWindowHandle();
		Set<String> setWindowHandles = driver.getWindowHandles();
		List<String> listWindow = new ArrayList<String>(setWindowHandles);
		driver.switchTo().window(listWindow.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow shadow = new Shadow(driver);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//WebElement element = driver.findElement(By.cssSelector("your-element-selector"));
		//jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		//driver.executeScript("arguments[0].click()", shadow);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		shadow.setImplicitWait(30);
		WebElement learningTrailhead = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions bulider = new Actions(driver);
		Thread.sleep(1000);
		//bulider.moveToElement(learningTrailhead).perform();
		bulider.moveToElement(learningTrailhead).perform();
		//bulider.scrollToElement(learningTrailhead).perform();
		//learningTrailhead.click();
		
		Shadow shadows = new Shadow(driver);
		WebElement certification = shadows.findElementByXPath("//a[text()='Salesforce Certification']");
		// Scroll to the element to make it visible
	//	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	//	WebElement element = driver.findElement(By.cssSelector("your-element-selector"));
	//	jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

		Actions actions = new Actions(driver);
		actions.scrollToElement(certification).perform();
		certification.click();
		Thread.sleep(1000);
		
		WebElement firstCertification = driver.findElement(By.xpath("//a[text()='Administrator']"));
		actions.scrollToElement(firstCertification).perform();
		firstCertification.click();
		String title = driver.getTitle();
		//System.out.println(title);
		if(title.contains("Administrator")) {
			System.out.println("Title Verified" +title);
		}
		else {
			System.out.println("Title not Verified");
		}
	}

}
