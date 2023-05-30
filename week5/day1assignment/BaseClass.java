package week5.day1assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class BaseClass {
	ChromeDriver driver;

	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Go to developer.servicenow.com
		driver.get("https://dev131493.service-now.com/");
		//Enter UserName And PassWord
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("mih80^=oVKFL");
		//Click Login 
		driver.findElement(By.id("sysverb_login")).click();
		//In shadow so create shadow obj
		
	}
	@AfterMethod
	public void postCondition() {
		driver.close();

	}
}
