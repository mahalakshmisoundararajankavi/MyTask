package com.marathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class BaseClass {
	public  ChromeOptions options;
	public  ChromeDriver driver;
	public String excelfileName;
	public SoftAssert softassert;
	@Parameters({"url","username","password"})
	@BeforeMethod(alwaysRun = true)
	public void preConditions(String url, String uName, String pWord) {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.id("Login")).click();
		softassert = new SoftAssert();
	}
	@AfterMethod(alwaysRun = true)
	public void postConditions() {
		driver.quit();
	}
	@DataProvider
	public String[][] sendData() throws IOException {
	return ReadExcelSheetTestCase01.readExcel(excelfileName);
	}
}
