package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatedLeadSteps extends BaseClass{
	
	@When("Click on crmsfa Link")
	public void crmsfaLink() {
		System.out.println(driver);
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("Click on Leads Link")
	public void lead() {
		driver.findElement(By.linkText("Leads")).click();

	}
	@And("Click on CreateLead Link")
	public void createLead() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

	}
	@Given("Enter the CompanyName as (.*)$")
	public void companyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);

	}
	@And("Enter the FirstName as (.*)$")
	public void firstName(String firstName) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(firstName);
	}
	@And("Enter the LastName as (.*)$")
	public void lastName(String lastName) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lastName);
	}
	@And("Enter the Phone Number as (.*)$")
	public void phoneNumber(String phoneNumber) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(phoneNumber);
	}
	@And("Click on Submit button")
	public void cerateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("ViewLeadsPage should be displayed as (.*)$")
	public void text(String companyName) {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(companyName)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}


}
