package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common_step_def_baseclass.Common_Step_Def_ProjectMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class AppLauncherPage extends Common_Step_Def_ProjectMethod{

	@And("I scroll to the Party Consent section")
	public AppLauncherPage scroll_to_party() {
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		return this;

	}
	@When("I click on the Individuals section")
	public IndividualPage i_click_on_the_individuals_section() {
	   WebElement indclick = driver.findElement(By.xpath("//p[text()='Individuals']"));
	   driver.executeScript("arguments[0].click();", indclick);
	   return new IndividualPage();
	}

	
}
