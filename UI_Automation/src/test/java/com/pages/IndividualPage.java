package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common_step_def_baseclass.Common_Step_Def_ProjectMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class IndividualPage extends Common_Step_Def_ProjectMethod{

	@When("click on individual link")
	public IndividualPage i_click_on_individual_and_click_on_the_new_individual_creation_link() {
	  driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a")).click();
	  return this;
	}
	   @And("click on the new individual creation link")
	   public NewIndividualPage newIndividuals() {
	   WebElement newIndividual = driver.findElement(By.xpath("//span[text()='New Individual']"));
	   driver.executeScript("arguments[0].click();", newIndividual);
	   return new NewIndividualPage();
	}

}
