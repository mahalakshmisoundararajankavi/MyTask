package com.marathon;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase01SaleForce extends BaseClass{
    @Test(dataProvider = "sendData", alwaysRun = true)
	public  void runSaleForceAppLancher(String questions, String answer) {
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Content",Keys.ENTER);
        driver.findElement(By.xpath("//mark[text()='Content']")).click();
        WebElement js = driver.findElement(By.xpath("//span[text()='Chatter']"));
        driver.executeScript("arguments[0].click();", js);
        //js.click();
        //System.out.println(js.getText());
        driver.findElement(By.xpath("//span[text()='Question']")).click();
        driver.findElement(By.xpath("//textarea[@class='cuf-questionTitleField textarea']")).sendKeys(questions);
        driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys(answer);
        WebElement question = driver.findElement(By.xpath("//button[text()='Ask']"));
        question.click();
        System.out.println(question.getText());
        String text = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[3]")).getText();
        System.out.println(text);
        String title = driver.getTitle();
        System.out.println("Page Title" +title);
        if(title.contains("Lightning")) {
        	System.out.println("Title is verified");
        }
        else {
        	System.out.println("Title is not verified");
        }
        softassert.assertAll();
	}
    @DataProvider
    public String[][] sendData() throws IOException {
	return ReadExcelSheetTestCase01.readExcel();

	}
 
}
