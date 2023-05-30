package week5.day1assignment;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ServiceNowInstanceCreation extends BaseClass{

	@Test
	public  void runInstanceCreation() {

		Shadow shadow = new Shadow(driver);
		//Click All 
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[text()='All']").click();

		shadow.setImplicitWait(15);
		WebElement filter = shadow.findElementByXPath("//input[@id='filter']");
		filter.sendKeys("Incident");
		Actions bulider = new Actions(driver);
		bulider.moveToElement(filter);
		shadow.setImplicitWait(15);
		WebElement incident = shadow.findElementByXPath("//mark[text()='Incident']");
		Actions b = new Actions(driver);
		b.moveToElement(incident);
		shadow.findElementByXPath("//span[text()='Create New']").click();

		//iframe inside shadow 
		Shadow sha = new Shadow(driver);
		WebElement frameElement = sha.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frameElement);		
		//		String windowHandle = driver.getWindowHandle();
		//		System.out.println(windowHandle);
		//		Set<String> windowHandles = driver.getWindowHandles();
		//		List<String> list = new ArrayList<String>(windowHandles);
		//		System.out.println(list);
		//		driver.switchTo().window(list.get(1));
		String incidentNumber = driver.findElement(By.xpath("//input[@id='incident.number']")).getText();
		System.out.println(incidentNumber);
		WebElement caller = driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']"));
		caller.sendKeys("Maha S");
		caller.click();
		driver.findElement(By.xpath("//button[@id='viewr.incident.caller_id']")).click();
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("Hello Devloper");
		driver.findElement(By.xpath("//span[text()='Resolution Information']")).click();
		WebElement select = driver.findElement(By.xpath("//select[@id='incident.close_code']"));
		Select ss = new Select(select);
		ss.selectByVisibleText("Resolved by caller");
		driver.findElement(By.xpath("//textarea[@id='incident.close_notes']")).sendKeys("Phone");
		driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();
		// driver.switchTo().defaultContent();

		//driver.findElement(By.xpath("//button[@class='form_action_button  action_context btn btn-default']")).click();
		String incidentValue = driver.findElement(By.xpath("//input[@id='incident.number']")).getText();
		System.out.println(incidentValue);
		String displayIncidents = driver.findElement(By.partialLinkText("Show related incidents")).getText();
		if(incidentValue.equals(incidentValue)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
