package week4.day1assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		1.Load the URL https://www.amazon.in/
		driver.get("https://www.amazon.in/");
//			2.search as oneplus 9 pro 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
//			3.Get the price of the first product
		String firstPrice = driver.findElement(By.xpath(" //span[@class='a-price-symbol']")).getText();
		String mobilePrice = firstPrice.replaceAll("[^0-9]", "");
		//float floatPrice = Float.parseFloat(mobilePrice);
		if(!mobilePrice.isEmpty()) {
		int intPrice = Integer.parseInt(mobilePrice);
		System.out.println("Mobile Price are : " +intPrice);
		}
//			4. Print the number of customer ratings for the first displayed product
		String mobileRatingValues = driver.findElement(By.xpath(" //span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("Mobile Global Rating is : " +mobileRatingValues);
//			5. Click the first text link of the first image
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath(" //span[@class='a-size-medium a-color-base a-text-normal']")).click();
		String firstWindowHandle = driver.getWindowHandle();
		System.out.println(firstWindowHandle);
		Set<String> setSecondWindowHandles = driver.getWindowHandles();
		System.out.println(setSecondWindowHandles);
		List<String> listsecondWindowHandles = new ArrayList<String>(setSecondWindowHandles);
		System.out.println(listsecondWindowHandles);
		driver.switchTo().window(listsecondWindowHandles.get(1));
//			6. Take a screen shot of the product displayed
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destionation = new File("./amazonMobile.png");
		FileUtils.copyFile(source, destionation);
//			7. Click 'Add to Cart' button
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
//			8. Get the cart subtotal and verify if it is correct.
		String cardSubTotal = driver.findElement(By.xpath("//b[text()='Cart subtotal']")).getText();
		String subTotalCard = cardSubTotal.replaceAll("[^0-9]", "");
		if(!subTotalCard.isEmpty()) {
		float floatSubTotal = Float.parseFloat(subTotalCard);
		System.out.println("Card SubTotal is : " +floatSubTotal);	
		}
		if(!listsecondWindowHandles.equals(firstWindowHandle)) {
			System.out.println("It get into new windows ");
		}
		else {
			System.out.println("Not get into new windows ");
		}
//			9.close the browser
		//driver.close();

	}

}
