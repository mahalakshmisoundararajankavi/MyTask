package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests{
	public  ChromeOptions opt;
	public  ChromeDriver driver;
	@BeforeMethod
	public void preCondition() {
		opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	@AfterMethod
	public void postcondition() {
		driver.quit();
	}

}
