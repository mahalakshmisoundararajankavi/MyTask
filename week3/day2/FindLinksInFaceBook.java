package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinksInFaceBook {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//To find the number od links
		int size = allLinks.size();
		System.out.println(size);
		
		//To retrieve the particular link out of allLinks
		WebElement secondLinksWebElement = allLinks.get(2);
		String text = secondLinksWebElement.getText();
		System.out.println(text);
		
		//using for loop to print all the links
//		for (int i = 0; i <=size; i++) {
//			String allLinksInString = allLinks.get(i).getText();
//			System.out.println(allLinksInString);
//		}
		
		//Declare the list 
		//List<String> list = new ArrayList<String>();
		
		//Using foreach loop to print all the links
		for (WebElement each : allLinks) {
			String text2 = each.getText();
			System.out.println(text2);
		//	list.add(text2);
		}
		//System.out.println(list);

	}

}
