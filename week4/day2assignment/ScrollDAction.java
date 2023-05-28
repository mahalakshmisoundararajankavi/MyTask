package week4.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScrollDAction {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebElement scroll = driver.findElement(By.xpath("//span[@class='ic-cod']"));
		WebElement scroll = driver.findElement(By.className("ic-cod"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.scrollToElement(scroll).perform();
		System.out.println(driver.getTitle());
		
	}

}
