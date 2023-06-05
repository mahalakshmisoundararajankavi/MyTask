package week6.day2;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{


	@Test(dataProvider = "sendData")//(invocationCount = 2, threadPoolSize = 2, priority = 1, alwaysRun = false)
	public  void runCreate(String cName, String fName, String lName, String pNo) {


		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Infosys")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}
		@DataProvider
	public String[][] sendData(){
      String[][] data = new String[2][4];
      
      data[0][0]="TestLeaf";
      data[0][1]="Maha";
      data[0][2]="S";
      data[0][3]="123";
      
      data[1][0]="infosys";
      data[1][1]="Mahalakshmi";
      data[1][2]="S";
      data[1][3]="123";
		return data;


	}

}
