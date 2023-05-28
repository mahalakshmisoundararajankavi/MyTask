package com.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) throws InterruptedException, IOException {
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
//		Shadow s = new Shadow(driver);
//		shadows.findElementByXPath("(//div[text()='Salesforce'])[2]").click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Salesforce<br/>Architect']")).click();

		String text = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text slds-text-align')] ")).getText();
		System.out.println("Summary : " +text);
//		List<WebElement> listCertification = driver.findElements(By.className("credentials-card_title"));
//		for (WebElement certification : listCertification) {
//			String text = certification.getText();
//			System.out.println(text);
//		}
//		System.out.println(" ");
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destionation = new File("./snaps/salesforce.jpg");
		FileUtils.copyFile(source, destionation);
	}

}
