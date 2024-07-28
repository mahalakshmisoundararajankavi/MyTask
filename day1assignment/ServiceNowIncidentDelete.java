package week5.day1assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ServiceNowIncidentDelete extends BaseClass{

	@Test
	public  void runInstanceDelete() {

		//In shadow so create shadow obj
		Shadow s = new Shadow(driver);
		//Click All 
		s.setImplicitWait(30);
		s.findElementByXPath("//div[text()='All']").click();

		s.setImplicitWait(15);
		WebElement filter = s.findElementByXPath("//input[@id='filter']");
		filter.sendKeys("Incident");
		Actions bulider = new Actions(driver);
		bulider.moveToElement(filter);
		s.setImplicitWait(15);
		WebElement incident = s.findElementByXPath("//mark[text()='Incident']");
		Actions b = new Actions(driver);
		b.moveToElement(incident);
		s.findElementByXPath("//span[text()='Open']").click();

		Shadow shas = new Shadow(driver);
		WebElement frameEle = shas.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frameEle);	
		driver.findElement(By.xpath("//a[text()='INC0010018']")).click();

		driver.findElement(By.xpath("(//button[text()='Delete'])[2]")).click();

	}

}
