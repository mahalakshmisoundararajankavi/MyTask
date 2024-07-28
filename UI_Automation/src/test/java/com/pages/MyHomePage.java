package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import common_step_def_baseclass.Common_Step_Def_ProjectMethod;
import io.cucumber.java.en.When;

public class MyHomePage extends Common_Step_Def_ProjectMethod{
	
	@When("Click on the app launcher")
	public MyHomePage click_on_the_app_launcher() {
	  driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	  return this;
	}
	@When("Click on View  All link")
	public AppLauncherPage click_on_view_all_link() {
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    return new AppLauncherPage();
	}


}
