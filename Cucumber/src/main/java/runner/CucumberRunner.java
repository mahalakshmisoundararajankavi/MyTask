package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = {"src/main/java/features/TC_001Login.feature","src/main/java/features/TC_002CreateLead.feature"}, 
glue = "steps", monochrome = true, publish = true, dryRun = false) //tags = "@Smoke")
//features is used to idenitfy the path for feature
//glue used for step definition
//monochrome is used for unread files and jung file to remove or ignore from the console
//publish is used for see the cucumber report in the console use the report for console copy and past in to browser you can see the report

public class CucumberRunner extends BaseClass{

}
