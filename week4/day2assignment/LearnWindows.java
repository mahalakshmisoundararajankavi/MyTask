package week4.day2assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindows {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//span[text()='Open']")).click();
	    String firstTitle = driver.getTitle();
	    System.out.println(firstTitle);
	    String parentWindow = driver.getWindowHandle();
	    Set<String> setChildWindow = driver.getWindowHandles();
	    int size = setChildWindow.size();
	    System.out.println(size);
	    List<String> listChildWindow = new ArrayList<String>(setChildWindow);
	    driver.switchTo().window(listChildWindow.get(1));
	    if(!listChildWindow.equals(parentWindow)) {
	    	System.out.println("It get into new  windows");
	    }
	    else {
	    	System.out.println("Not get windows");
	    }
	}

}
