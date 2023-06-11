Feature: Login functionality of Leaftaps Application

Background:
Given Open the chrome browser
And Load the url
And Load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed

Scenario Outline: Login for positive credentails
When Click on crmsfa Link
And Click on Leads Link
And Click on CreateLead Link
Given Enter the CompanyName as <companyName>
And Enter the FirstName as<firstName>
And Enter the LastName as <lastName>
When Click on Submit button
Then ViewLeadsPage should be displayed as <companyName>

Examples:
|userName|passWord|companyName|firstName|lastName|
|Demosalesmanager|crmsfa|TestLeaf|Maha|S|
|Demosalesmanager|crmsfa|Infosys|Mahalakshmi|S|
