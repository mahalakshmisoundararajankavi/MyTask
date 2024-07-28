package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadStep extends BaseClass{
	
//	@Given("Open the chrome browser")
//	public void open_the_chrome_browser() {
//	    
//	}
//
//	@Given("Load the url")
//	public void load_the_url() {
//	   
//	}
	
	@Given("Click on the Leads link")
	public void click_on_the_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click on the Find Leads link")
	public void click_on_the_find_leads_link() {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	}

	@When("Click on the Phone Number")
	public void click_on_the_phone_number() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	
	}

	@When("Enter  in the phone number  as {int}")
	public void enter_in_the_phone_number_as(Integer int1) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	}

	@When("Click the Find Leads button")
	public void click_the_find_leads_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@When("Click on the first lead in the search results")
	public void click_on_the_first_lead_in_the_search_results() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@When("Click on the Edit link")
	public void click_on_the_edit_link() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@When("Enter the companyName as TCS")
	public void clear_the_company_name() {
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("TCS");
	}

	@When("Enter the Company Name as TCS")
	public void enter_the_company_name_as_tcs() {
		
	}

	@When("Click the Submit button")
	public void click_the_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}


	@Then("Should see the message Lead is edited successfully")
	public void should_see_the_message_lead_is_edited_successfully() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TCS")) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not editted");
		}
	}

	


	   
	}




