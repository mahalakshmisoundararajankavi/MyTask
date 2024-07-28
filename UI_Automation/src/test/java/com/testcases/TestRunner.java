package com.testcases;

import org.junit.runner.RunWith;

import common_step_def_baseclass.Common_Step_Def_ProjectMethod;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features" , glue = "com.pages", monochrome = true, publish = true)
public class TestRunner extends Common_Step_Def_ProjectMethod{

}
