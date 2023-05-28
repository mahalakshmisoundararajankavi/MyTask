package week4.day2assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		1) Open https://www.myntra.com/
		driver.get("https://www.myntra.com/");
		//			2) Mouse hover on MeN 
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions bulider = new Actions(driver);
		bulider.moveToElement(men);
		//			3) Click Jackets 
		driver.findElement(By.xpath("//a[@href='/men-jackets']")).click();
		driver.findElement(By.xpath("//a[text()='Jackets for Men']")).click();
		//			4) Find the total count of item 
		 List<WebElement> productDetails = driver.findElements(By.className("product-brand"));
		 System.out.println(productDetails);
		//			5) Validate the sum of categories count matches
		//			6) Check jackets
		//			7) Click + More option under BRAND
		//			8) Type Duke and click checkbox
		//			9) Close the pop-up x
		//			10) Confirm all the Coats are of brand Duke
		//			    Hint : use List 
		//			11) Sort by Better Discount
		//			12) Find the price of first displayed item
		//			Click on the first product
		//			13) Take a screen shot
		//			14) Click on WishList Now
		//			15) Close Browser
	}

}
