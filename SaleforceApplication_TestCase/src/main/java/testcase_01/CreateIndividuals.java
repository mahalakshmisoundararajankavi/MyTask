package testcase_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateIndividuals {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click the url
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("maha@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement party = driver.findElement(By.xpath("//p[text()='Party Consent']"));
		driver.executeScript("arguments[0].scrollIntoView();", party);
		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", individual);
		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a")).click();
		driver.findElement(By.xpath("//span[text()='New Individual']")).click();
		WebElement ms = driver.findElement(By.xpath("//a[text()='Ms.']"));
		driver.executeScript("arugments[0].click();", ms);
		driver.findElement(By.xpath("//input[contains(@class,'lastName compoundBLRadius ')]")).sendKeys("Soundararajan");
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	}

}
