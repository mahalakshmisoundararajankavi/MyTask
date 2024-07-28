package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditIndividualsStep extends BaseClass{
	@Test
	@Given(" Click on App Launcher")
	public void click_on_app_lancher() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}
	@And("Click on View All link")
	public void click_on_view_all_button() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	@And("Click on the Individual link")
	public void click_on_the_individuals() {
		WebElement dropDown = driver.findElement(By.xpath("//p[text()='Individuals']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(dropDown).perform();
		dropDown.click();
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}
	@And("Search the individual name as (.*)$")
	public void searchName(String name) {
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys(name);

	}
	@And("Click on the Edit link to Edit")
	public void clickEditLink() {
		driver.findElement(By.xpath("//a[contains(@class,'slds-button--icon-border-filled')]")).click();
		driver.findElement(By.xpath("//a[@title='Edit']")).click();

	}
		
	@And("Select Salutation as mr")
	public void selectMr() {
		driver.findElement(By.xpath("//a[@class='select']")).click();
	driver.findElement(By.xpath("//a[text()='Mr.']")).click();

	}
	@Given("Enter the firstname as (.*)$")
	public void enterFirstName(String firstname) {
		driver.findElement(By.xpath("//input[@class='firstName compoundBorderBottom form-element__row input']")).sendKeys(firstname);

	}

	@And("Click on Save button")
	public void clickSave() {
		WebElement save = driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
		save.click();

	}
	@Then("Verifiy the firstname should be dispaly")
	public void verifiyName() {
		String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(text);

	}
//	public static void main(String[] args) {
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//		ChromeDriver driver = new ChromeDriver(opt);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		//1. Login to https://login.salesforce.com
//		driver.get("https://login.salesforce.com");
//		driver.findElement(By.id("username")).sendKeys("maha@testleaf.com");
//		driver.findElement(By.id("password")).sendKeys("Test@1234");
//		driver.findElement(By.id("Login")).click();
//		//2. Click on the toggle menu button from the left corner
//		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
//		//3. Click View All and click Individuals from App Launcher        
//		driver.findElement(By.xpath("//button[text()='View All']")).click();
//		//4. Click on the Individuals tab 
//		WebElement scrollDownEle = driver.findElement(By.xpath("//p[text()='Individuals']"));
//		Actions bulider = new Actions(driver);
//		bulider.scrollToElement(scrollDownEle).perform();
//		scrollDownEle.click();
//		//5. Search the Individuals 'Kumar'
//		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Soundararajan");
//		//6. Click on the Dropdown icon and Select Edit
//		driver.findElement(By.xpath("//a[contains(@class,'slds-button--icon-border-filled')]")).click();
//		driver.findElement(By.xpath("//a[@title='Edit']")).click();
//		//7.Select Salutation as 'Mr'
//		driver.findElement(By.xpath("//a[@class='select']")).click();
//		driver.findElement(By.xpath("//a[text()='Mr.']")).click();
//		//8.Enter the first name as 'Ajay'.
//		driver.findElement(By.xpath("//input[@class='firstName compoundBorderBottom form-element__row input']")).sendKeys("Ajay");
//		//9. Click on Save and Verify the first name as 'Ganesh'"
//		WebElement save = driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
//		save.click();
//		String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
//		System.out.println(text);
		/*
		 * "Test Steps:
1. Login to https://login.salesforce.com
2. Click on the toggle menu button from the left corner
3. Click View All and click Individuals from App Launcher 
4. Click on the Individuals tab 
5. Search the Individuals 'Kumar'
6. Click on the Dropdown icon and Select Edit
7.Select Salutation as 'Mr'
8.Enter the first name as 'Ganesh'.
9. Click on Save and Verify the first name as 'Ganesh'"

		 */
	}


