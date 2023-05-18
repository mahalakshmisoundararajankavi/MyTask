package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Maha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("xxyyzz");
		
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select selectdate = new Select(date);
		selectdate.selectByVisibleText("8");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("Apr");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("2006");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		

	}

}
