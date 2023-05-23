package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		//To LaunchBrowser
		ChromeDriver driver = new ChromeDriver();
		//To max the windows
		driver.manage().window().maximize();
		//To load url
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Maha");
		WebElement sourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(sourceId);
		//select.deselectByVisibleText("Existing Customer");
		select.selectByIndex(4);
		
		WebElement element = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sec = new Select(element);
		sec.selectByVisibleText("Computer Software");
		WebElement element2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel = new Select(element2);
		sel.selectByValue("OWN_CCORP");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lakshmi");
		
		WebElement findElement = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select1 = new Select(findElement);
		select1.selectByVisibleText("Automobile");
		
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("TestLeaf " + title);
	}

}
