package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass  {
	
//	@Given("Open the chrome brower")
//	public void openBrowser() {
//		driver = new ChromeDriver();
//		System.out.println(driver);
//	}
//	@And("Load the url")
//	public void loadUrl() {
//		driver.get("http://leaftaps.com/opentaps/control/main");
//	}
	@And("Enter the username as (.*)$")
	public void enterUserName(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}
	@And("Enter the password as (.*)$")
	public void enterPassword(String passWord) {
		driver.findElement(By.id("password")).sendKeys(passWord);
	}
	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("HomePage should be displayed")
	public void verfiyHomePage() {
		String title = driver.getTitle();
		if(title.contains("Leaftaps")) {
			System.out.println("Login successfull");
		}
		else {
			System.out.println("Login not successfull");
		}
	}
		@But("ErrorMessage should be displayed")
		public void verfiyErrorMessage() {
			System.out.println("Error Message ");
		}

	

}
