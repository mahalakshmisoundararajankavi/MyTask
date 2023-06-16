package com.marathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase02SaleForce extends BaseClass {
    @Test(dataProvider = "sendData", alwaysRun = true )
	public  void runSaleForceNewOpportunity(String name, String amount) {

		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("sales",Keys.ENTER);
		driver.findElement(By.xpath("(//mark[text()='Sales'])[3]")).click();
		WebElement js = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", js);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//label[text()='Type']")).click();
		driver.findElement(By.xpath("//span[text()='New Customer']")).click();
		driver.findElement(By.xpath("//label[text()='Lead Source']")).click();
		driver.findElement(By.xpath("//span[text()='Partner Referral']")).click();
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount);
		driver.findElement(By.xpath("//label[text()='Close Date']")).click();
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("17/06/2023");
		driver.findElement(By.xpath("//label[text()='Stage']")).click();
		WebElement need = driver.findElement(By.xpath("(//span[text()='Needs Analysis'])[4]"));
		Actions b = new Actions(driver);
		b.scrollToElement(need).perform();
		need.click();
		driver.findElement(By.xpath("//label[text()='Primary Campaign Source']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='REST API']")).click();
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		System.out.println(save.getText());
		save.click();
		String title = driver.getTitle();
		System.out.println("Page Title " +title);
		if(title.contains("New Opportunity | Salesforce")) {
			System.out.println("Title is verifiy");
		}
		else {
			System.out.println("Title is not verifiy");
		}
	}
	@DataProvider
	public String[][] sendData() throws IOException {
		return ReadExcelData.readDataExcel();
		

	}

}
