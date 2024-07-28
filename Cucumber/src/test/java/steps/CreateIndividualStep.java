package steps;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateIndividualStep extends BaseClass{
	@Test
	@When("Click on App Lancher")
	public void click_on_app_lancher() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@When("Click on View All button")
	public void click_on_view_all_button() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}

	@When("Click on the Individuals")
	public void click_on_the_individuals() {
		WebElement dropDown = driver.findElement(By.xpath("//p[text()='Individuals']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(dropDown).perform();
		dropDown.click();
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@Given("Enter the lastname as (.*)$")
	public void enter_the_lastname_as_soundararajan(String lastname) {
		driver.findElement(By.xpath("//input[contains(@class,'lastName compoundBLRadius')]")).sendKeys(lastname);
	}

	@Given("Click on save button")
	public void click_on_save_button() {
		WebElement clickAndVerify = driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
		clickAndVerify.click();
		
		String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(text);
		System.out.println(driver.getTitle());
	}

	@Then("Then Verifiy the lastname should be dispaly")
	public void then_verifiy_the_lastname_should_be_dispaly() {

		String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
				 System.out.println(text);
				System.out.println(driver.getTitle());
	}

//2. Click on the toggle menu button from the left corner
//		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
//		//3. Click View All and click Individuals from App Launcher
//		driver.findElement(By.xpath("//button[text()='View All']")).click();
//		//4. Click on the Dropdown icon in the Individuals tab
//		WebElement dropDown = driver.findElement(By.xpath("//p[text()='Individuals']"));
//		Actions builder = new Actions(driver);
//		builder.moveToElement(dropDown).perform();
//		dropDown.click();
//		//5. Click on New Individual
//		driver.findElement(By.xpath("//div[text()='New']")).click();
//		//6. Enter the Last Name as 'Kumar'
//		driver.findElement(By.xpath("//input[contains(@class,'lastName compoundBLRadius')]")).sendKeys("Soundararajan");
//		//7.Click save and verify Individuals Name"
//		WebElement clickAndVerify = driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
//		clickAndVerify.click();
//		Thread.sleep(3000);
//		String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
//		System.out.println(text);
//		System.out.println(driver.getTitle());
		/*
		 * "Test Steps:
		1. Login to https://login.salesforce.com
		2. Click on the toggle menu button from the left corner
		3. Click View All and click Individuals from App Launcher
		4. Click on the Dropdown icon in the Individuals tab
		5. Click on New Individual
		6. Enter the Last Name as 'Kumar'
		7.Click save and verify Individuals Name"

		 */

	}


