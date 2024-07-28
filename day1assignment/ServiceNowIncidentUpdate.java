package week5.day1assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ServiceNowIncidentUpdate extends BaseClass {

	@Test
	public  void runInstanceUpdate() {

		Shadow shadow = new Shadow(driver);
		//Click All 
		shadow.setImplicitWait(10);
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
		shadow.findElementByXPath("//span[text()='Open']").click();

		//iframe inside shadow 
		Shadow sha = new Shadow(driver);
		WebElement frameElements = sha.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frameElements);	
		driver.findElement(By.xpath("//a[text()='INC0010018']")).click();
		//driver.findElement(By.xpath("//a[text()='Maha S']")).click();

		WebElement state = driver.findElement(By.xpath("//select[@id='incident.state']"));
		Select sec = new Select(state);
		sec.selectByVisibleText("In Progress");
		String stateText = state.getText();
		System.out.println("Verified State Value : " +stateText);

		WebElement urgency = driver.findElement(By.xpath("//select[@id='incident.urgency']"));
		Select se = new Select(urgency);
		se.selectByVisibleText("1 - High");
		String urgencyText = urgency.getText();
		System.out.println("Verified Urgrncy Value : " + urgencyText);

		WebElement priority = driver.findElement(By.xpath("//select[@id='incident.priority']"));
		//		Select s = new Select(priority);
		//		s.selectByVisibleText("5 - Planning");
		String priorityText = priority.getText();
		System.out.println("Verified Priority Value " +priorityText);

		driver.findElement(By.xpath("//button[@id='sysverb_update_bottom']")).click();

	}

}
