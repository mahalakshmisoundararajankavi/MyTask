package steps;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass{
	@Test
	@Given("Enter the username as (.*)$")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}
	@And("Enter the password as (.*)$")
	public void enterPassWord(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}
	@When("Click on login button")
	public void clickLogin() {
		driver.findElement(By.id("Login")).click();


	}
//	driver.get("https://login.salesforce.com");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	//enter user name and password
//	driver.findElement(By.id("username")).sendKeys("maha@testleaf.com");
//	driver.findElement(By.id("password")).sendKeys("Test@1234");
//	driver.findElement(By.id("Login")).click();

}
