package week4.day1assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleFrames {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
        System.out.println("First Window Title" +driver.getTitle());
        String windowHandle = driver.getWindowHandle();
        Set<String> setWindowHandle = driver.getWindowHandles();
        List<String> listWindowHandle = new ArrayList<String>(setWindowHandle);
        System.out.println(driver.getTitle());
        driver.switchTo().defaultContent();
        if(!listWindowHandle.equals(windowHandle)) {
        	System.out.println("It window get into new Window");
        }
        else {
        	System.out.println("Not get into new window");
        }
	}

}
