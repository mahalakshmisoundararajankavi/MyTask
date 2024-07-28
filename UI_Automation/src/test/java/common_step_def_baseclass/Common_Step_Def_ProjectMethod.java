package common_step_def_baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.testcases.TestRunner;
import com.utils.ReadExcel;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Common_Step_Def_ProjectMethod extends AbstractTestNGCucumberTests{

	public static ChromeDriver driver;
	public String excelFilename;
	public static ExtentReports extents;
	public static ExtentTest test;
	public String testName, testDescription, testCategory, testAuthor;

	@BeforeSuite
	public void startReports() {
		ExtentHtmlReporter reports = new ExtentHtmlReporter("./reports/result.html");
		reports.setAppendExisting(true);
	    extents = new ExtentReports();
		extents.attachReporter(reports);
	}
	@AfterSuite
	public void stopReports() {
		extents.flush();

	}
	
	public void takeSnap() throws IOException {
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snap/img.png");
		FileUtils.copyFile(source, target);

	}
	
	public void testCaseDetails() throws IOException {
		  test = extents.createTest(testName, testDescription);
		  test.addScreenCaptureFromPath("./snap/img.png");
		  test.assignCategory(testCategory);
		  test.assignAuthor(testAuthor);

	}
	//@Parameters("url")
	@BeforeMethod
	public void preconditions() throws InterruptedException {
		// ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("{--disable-notifications");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Thread.sleep(3000);
		driver.get("https://login.salesforce.com/");

	}
	@AfterMethod
	public void postconditions() {
		driver.quit();
	}
	@DataProvider
	public String[][] sendData() throws IOException {
		return ReadExcel.readExcel(excelFilename);
	}

}
