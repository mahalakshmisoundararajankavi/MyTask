package com.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.LoginPage;

import common_step_def_baseclass.Common_Step_Def_ProjectMethod;

public class RunTestCase extends Common_Step_Def_ProjectMethod{
	@BeforeTest
	public void setValue() {
		excelFilename="Login";
		testName = "VerifyLogin";
		testDescription = "Verify  login with valid data";
		testCategory = "smoke";
		testAuthor = "Maha";

	}
	@Test(dataProvider = "sendData")
	public void runtest(String username, String password) {
		LoginPage lp = new LoginPage();
		lp.enterUserName(username);
		lp.enterPassWord(password);
		lp.clickOnLoginButton();
		lp.verifiy_title_name_should_be_disaply();
		
		
		
		
	}

}
