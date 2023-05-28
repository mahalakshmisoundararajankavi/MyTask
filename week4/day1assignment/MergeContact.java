package week4.day1assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//		1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		//		 * 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//		 * 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//		 * 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//		 * 5. Click on contacts Button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//		 * 6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//		 * 7. Click on Widget of From Contact
		//		 * 8. Click on First Resulting Contact
		driver.findElement(By.xpath("//span[text()='From Contact']/following::input")).sendKeys("7339067472",Keys.ENTER);
		// 9. Click on Widget of To Contact
		// 10. Click on Second Resulting Contact
		driver.findElement(By.xpath("//span[text()='To Contact']/following::input")).sendKeys("7339069472",Keys.ENTER);   
		//		 * 11. Click on Merge button using Xpath Locator
		WebElement merge = driver.findElement(By.xpath("//a[text()='Merge']"));
		merge.click();
		//		 * 12. Accept the Alert
		Alert merageAlert = driver.switchTo().alert();
		//		 * 13. Verify the title of the page
		merageAlert.accept();
		String title = driver.getTitle();
		System.out.println(title);
		String text = merageAlert.getText();
		System.out.println(text);

	}

}
