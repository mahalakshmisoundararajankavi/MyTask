Feature: Login functionality of Leaftaps Application

#Background:
#Background use for command steps and Background is applicable for only single not for all feature file
#Given Open the chrome brower

Scenario Outline:: Login for positive credentials
#'data' this a paramaterzation
And Enter the username as <userName>
And Enter the password as <passWord>
When Click on Login button
Then HomePage should be displayed
Examples:
|userName|passWord|
|demoSalesManager|crmsfa|

#Scenario Outline:: Login for invalid credentials
#'data' this a paramaterzation
#And Enter the username as <userName>
#And Enter the password as <pWord>
#When Click on Login button
#But ErrorMessage should be displayed
#Examples:
#|userName|pWord|
#|demoSalesManager|crmsf|