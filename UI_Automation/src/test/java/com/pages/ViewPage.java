package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import common_step_def_baseclass.Common_Step_Def_ProjectMethod;
import io.cucumber.java.en.Then;

public class ViewPage extends Common_Step_Def_ProjectMethod {


	@Then("Verifiy name should be display")
	public ViewPage verifiy_name_should_be_display() {
	   System.out.println(driver.getTitle());
	   String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	   System.out.println(text);
	   return this;
	}


}
