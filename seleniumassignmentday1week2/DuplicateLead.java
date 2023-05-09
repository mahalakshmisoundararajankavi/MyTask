package seleniumassignmentday1week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args)  {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MahaLakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MahaLakshmi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("maha@gmail.com");
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select1 = new Select(stateProvince);
		select1.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		String title2 = driver.getTitle();
	    System.out.println(title2);
	   // Thread.sleep(3000);
	    driver.findElement(By.partialLinkText("Duplicate Lead")).click();
	    WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
	    companyName.clear();
	    companyName.sendKeys("Test Leaf");
	    WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
	    firstName.clear();
	    firstName.sendKeys("Maha");
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    System.out.println(driver.getTitle());
  
	}

}
