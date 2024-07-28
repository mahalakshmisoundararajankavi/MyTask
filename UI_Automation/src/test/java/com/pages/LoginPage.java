package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import common_step_def_baseclass.Common_Step_Def_ProjectMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends Common_Step_Def_ProjectMethod {

	@Given("Enter the username as (.*)$")
	public LoginPage enterUserName(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
		return this;
	}

	@Given("Enter the password as (.*)$")
	public LoginPage enterPassWord(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}

	@When("Click on login button")
	public MyHomePage clickOnLoginButton() {
		driver.findElement(By.id("Login")).click();
		return new MyHomePage();
	}

	@Then("verifiy title name should be disaply")
	public void verifiy_title_name_should_be_disaply() {
		String title = driver.getTitle();
		if(title.contentEquals("Lightning Experience")) {
			System.out.println("Title is match " + title);
		}
		else {
			System.out.println("Title is not match ");
		}
	}

	

}
