package seleniumassignmentday1week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
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
		driver.findElement(By.partialLinkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Notes");
		//driver.findElement(By.name("submitButton")).click();
		//driver.findElement(By.tagName("type=\"submit\"")).click();
		//WebElement update = driver.findElement(By.xpath("//input[@name='submitButton']"));
       // update.click();
		WebElement findElement = driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]"));
		findElement.click();
	    String title1 = driver.getTitle();
	    System.out.println(title1);
	    //driver.close();

	}

}
