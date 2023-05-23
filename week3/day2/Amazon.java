package week3.day2;

import java.text.CollationElementIterator;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//To get URL
		driver.get("https://www.amazon.in/");
		
		//Search for mobiles in the search box ad click Enter
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		
		//To get all the moblie price
		List<WebElement> mobliePriceLinks = driver.findElements(By.className("a-price-whole"));
		int size = mobliePriceLinks.size();
		System.out.println(size);
		//Declare the list
		List<Integer> list =new ArrayList<Integer>();

		//Iterate through for each loop and get text
		for (WebElement mobliePrices : mobliePriceLinks) {
			String text = mobliePrices.getText();
			String replaceString = text.replaceAll(",", "");
			//Donot allow white spaces before converting String to Integer
			if(!replaceString.isEmpty()) {
				//Convert String to Integer
				int priceValues = Integer.parseInt(replaceString);
				//add all price values into the list
				list.add(priceValues );
				Collections.sort(list);
				System.out.println(priceValues);
			}
		//Collections.sort()
			//System.out.println(prriceV);
			//System.out.println(list);
		}
		//Collections.sort(list);
		int listSize = list.size();
		System.out.println(listSize);
		
		//To remove duplicates
		//Declare a Set
		//To add list values into the Set, pass the list name into Set constructor
		Set<Integer> unqiue = new TreeSet<Integer>();
		int setSize = unqiue.size();
		System.out.println(setSize);
		//to Confirm whether list contains duplicate values declare an if condition
		if(listSize==setSize) {
			System.out.println("No Duplications founds");
		}
		else {
			System.out.println("There are duplications values ");
		}
//		List<Integer> list2 = new ArrayList<Integer>();
//		int size2 = list2.size();
//		System.out.println(size2);
	}

}
