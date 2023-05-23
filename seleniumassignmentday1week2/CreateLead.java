package seleniumassignmentday1week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver dri = new ChromeDriver();
		dri.get("http://leaftaps.com/opentaps/control/login");
		dri.manage().window().maximize();
		dri.findElement(By.id("username")).sendKeys("demoSalesManager");
		dri.findElement(By.id("password")).sendKeys("crmsfa");
		dri.findElement(By.className("decorativeSubmit")).click();
		dri.findElement(By.partialLinkText("CRM/SFA")).click();
		dri.findElement(By.partialLinkText("Leads")).click();
		dri.findElement(By.partialLinkText("Create Lead")).click();
		dri.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		dri.findElement(By.id("createLeadForm_firstName")).sendKeys("MahaLakshmi");
		dri.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		dri.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mahalakshmi");
		dri.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		dri.findElement(By.id("createLeadForm_description")).sendKeys("ABC");
		dri.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("maha@gmail.com");
		WebElement stateProvince = dri.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		//dri.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		dri.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91+");
		dri.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		Select select = new Select(stateProvince);
		select.selectByVisibleText("New York");
	    dri.findElement(By.className("smallSubmit")).click();
	    String title = dri.getTitle();
	    System.out.println(title);
		
	}

}
