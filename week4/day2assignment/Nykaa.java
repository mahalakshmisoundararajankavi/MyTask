package week4.day2assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//		1) Go to  https://www.nykaa.com/
		driver.get(" https://www.nykaa.com/");
		//			2) Mouseover on Brands and Search L'Oreal Paris
		String pWindowHandle = driver.getWindowHandle();
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions bulider = new Actions(driver);
		bulider.moveToElement(brands).perform();
		//		3) Click L'Oreal Paris
		//driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris",Keys.ENTER);
		//			4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		driver.findElement(By.xpath("//div[@id='list_topbrands']/following::a[6]")).click();
		//driver.findElement(By.xpath("//div[@id='list_topbrands']/following::a[6]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//			5) Click sort By and select customer top rated
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		//			6) Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@class='filter-name ']")).click();
		driver.findElement(By.xpath("//span[@class='filter-name highlight']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.findElement(By.xpath("//label[@for='checkbox_Shampoo_316']")).click();
		//driver.findElement(By.xpath("//div[@class='control-indicator checkbox ']"));
		//			7) Click->Concern->Color Protection
		driver.findElement(By.xpath("//span[@class='filter-name ']")).click();
		driver.findElement(By.xpath("((//span[text()='Color Protection'])[2]")).click();
		//			8)check whether the Filter is applied with Shampoo
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String filters = driver.findElement(By.xpath("//span[text()='Filters Applied']")).getText();
		if(filters.contains("Shampoo")) {
			System.out.println("It have shampoo");
		}
		else {
			System.out.println("not have shampoo");
		}
		//			9) Click on L'Oreal Paris Colour Protect Shampoo
		WebElement allProducts = driver.findElement(By.xpath("//div[text()='All Products']"));
		Actions buliders = new Actions(driver);
		buliders.scrollToElement(allProducts).perform();
		WebElement shampooProducts = driver.findElement(By.xpath("(//div[@class='css-xrzmfa'])[10]"));
		shampooProducts.click();
		//			10) GO to the new window and select size as 175ml
		Set<String> setWindowHandles = driver.getWindowHandles();
		List<String> listWindowHandles = new ArrayList<String>(setWindowHandles);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		//			11) Print the MRP of the product
		String text = driver.findElement(By.xpath("//span[text()='₹399']")).getText();
		System.out.println(text);
		//			12) Click on ADD to BAG
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		//			13) Go to Shopping Bag 
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		//			14) Print the Grand Total amount
		String text2 = driver.findElement(By.xpath("//span[text()='Grand Total']")).getText();
		System.out.println(text2);
		//			15) Click Proceed
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		//			16) Click on Continue as Guest
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement guest = driver.findElement(By.xpath("//button[text()='Continue as guest']"));
		guest.click();
		//			17) Check if this grand total is the same in step 14
		if(text2.equals(guest)) {
			System.out.println("Print Grand Total is Verified");
		}
		else {
			System.out.println("Not Verified");
		}
		//			18) Close all windows
	}

}
