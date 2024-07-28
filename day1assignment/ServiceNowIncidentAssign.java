package week5.day1assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ServiceNowIncidentAssign extends BaseClass{

	@Test
	public  void runInstanceAssign() {

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
		Shadow shas = new Shadow(driver);
		WebElement frameEle = shas.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frameEle);	
		driver.findElement(By.xpath("//a[text()='INC0010018']")).click();

		WebElement category = driver.findElement(By.xpath("//select[@id='incident.category']"));
		Select secc = new Select(category);
		secc.selectByVisibleText("Software");

		WebElement assigmentGroup = driver.findElement(By.xpath("//button[@id='lookup.incident.assignment_group']"));
		assigmentGroup.click();
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		//driver.findElement(By.xpath("//button[@id='lookup.incident.assignment_group']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement application = driver.findElement(By.xpath("//input[@class='form-control']"));
		Actions app = new Actions(driver);
		app.moveToElement(application).perform();
		//app.click().perform();
		driver.switchTo().defaultContent();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//button[@id='lookup.incident.assigned_to']")).click();
		WebElement assignedTo = driver.findElement(By.xpath("//input[@class='form-control']"));
		Actions ass = new Actions(driver);
		ass.moveToElement(assignedTo);
		driver.switchTo().defaultContent();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@id='sysverb_update_bottom']")).click();
	}

}
