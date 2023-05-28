package week4.day1assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SweetAlert {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
//		a)Launch the browser
		ChromeDriver driver = new ChromeDriver(opt);
		https://www.leafground.com/window.xhtml
//			b)Load the url https://www.irctc.co.in/nget/train-search
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		c)Enter MS in ‘From’ textbox
		//span[@class='ng-tns-c57-8 ui-autocomplete ui-widget']/input
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-8 ui-autocomplete ui-widget']/input")).sendKeys("chennai");
		driver.findElement(By.xpath("//span[text()='CHENNAI EGMORE - MS']")).click();
//		d)Enter Cape in ‘To’ textbox
		////span[@class='ng-tns-c57-9 ui-autocomplete ui-widget']/input
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-9 ui-autocomplete ui-widget']/input")).sendKeys("Cape");
		////span[text()='KANYAKUMARI - CAPE']
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='KANYAKUMARI - CAPE']")).click();
//		e)Click search button 
		driver.findElement(By.xpath("//button[text()='Search']")).click();
//		f)Click refresh button
		driver.findElement(By.xpath("//div[contains(text(),' Refresh ')]")).click();
//		g)Click WL and Click BookNow button
		driver.findElement(By.xpath("//strong[contains(text(),'WL149')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),' Book Now ')]")).click();
//		e)Click No button in the alert
        driver.findElement(By.xpath("//span[text()='No']")).click();
//		Alert irctc = driver.switchTo().alert();
//		String text = irctc.getText();	
//		System.out.println(text);
//		irctc.dismiss();
	}

}
