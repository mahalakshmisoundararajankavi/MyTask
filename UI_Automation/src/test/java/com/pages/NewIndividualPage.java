package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import common_step_def_baseclass.Common_Step_Def_ProjectMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class NewIndividualPage extends Common_Step_Def_ProjectMethod{

	
	@When("I select the title mr")
	public NewIndividualPage i_select_the_title_mr() {
	    driver.findElement(By.xpath("//a[@class='select']")).click();
	    driver.findElement(By.xpath("//a[text()='Mr.']")).click();
	    return this;
	    
	}

	@Given("Enter the lastname as (.*)$")
	public NewIndividualPage enter_the_lastname_as_soundararajan(String lastname) throws InterruptedException {
		//Thread.sleep(500);
	    driver.findElement(By.xpath("//input[@class='lastName compoundBLRadius compoundBRRadius form-element__row input']")).sendKeys(lastname);
	    return this;
	}

	@Given("Click on save button")
	public ViewPage click_on_save_button() {
	    driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	    return new ViewPage();
	}


}
