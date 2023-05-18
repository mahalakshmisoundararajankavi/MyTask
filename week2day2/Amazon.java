package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("USI punching bag",Keys.ENTER);
		

	}

}
