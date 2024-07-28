package com.utils;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {

	public static void main(String[] args) throws IOException {
	  ExtentHtmlReporter reports = new ExtentHtmlReporter("./reports/result.html");
	  reports.setAppendExisting(true);
	  ExtentReports extents = new ExtentReports();
	  extents.attachReporter(reports);
	  
	  ExtentTest test1 = extents.createTest("verifyLogin", "Login with valid credential");
	  test1.addScreenCaptureFromPath("./snap/img.png");
	  test1.assignCategory("smoke");
	  test1.assignAuthor("Maha");
	}

}
