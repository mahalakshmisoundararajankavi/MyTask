package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnIFrames {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.switchTo().frame("dummy-chat-button-iframe");
        driver.findElement(By.xpath("//button[@id='dummy-chat-button']")).click();
        driver.switchTo().frame("ShopifyChat");
        driver.findElement(By.xpath("//textarea[@class='composer-bar__message-text ']")).sendKeys("Hai");
        driver.findElement(By.xpath("//button[contains(@class,'chat-app--')]")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.className("product-title ")).click();
        
	}

}
