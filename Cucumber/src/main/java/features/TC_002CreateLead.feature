Feature: Login functionality of Leaftaps Application

#Background:
#Given Open the chrome browser
#And Load the url


Scenario Outline: Create for multiple data 
And Enter the username as <userName>
And Enter the password as <passWord>
When Click on Login button
Then HomePage should be displayed
When Click on crmsfa Link
And Click on Leads Link
And Click on CreateLead Link
Given Enter the CompanyName as <companyName>
And Enter the FirstName as <firstName>
And Enter the LastName as <lastName>
And Enter the Phone Number as <phoneNumber>
When Click on Submit button
Then ViewLeadsPage should be displayed as <companyName>

Examples:
|userName|passWord|companyName|firstName|lastName|phoneNumber|
|Demosalesmanager|crmsfa|Infosys|Mahalakshmi|S|99|
|Demosalesmanager|crmsfa|TCS|Anitha|S|98|

#ctrl+/ = # this is a short cut for the features file
#Scenario Outline: Create for InValid credentails
#And Enter the username as <userName>
#And Enter the password as <passWord>
#When Click on Login button
#Then HomePage should be displayed
#When Click on crmsfa Link
#And Click on Leads Link
#And Click on CreateLead Link
#Given Enter the CompanyName as <companyName>
#And Enter the FirstName as <firstName>
#And Enter the LastName as <lastName>
#And Enter the Phone Number as <phoneNumber>
#When Click on Submit button
#Then ViewLeadsPage should be displayed as <companyName>
#Examples:
#|userName|passWord|companyName|firstName|lastName|phoneNumber|
#|Demosalesmanager|crmsfa|Infosys|Mahalakshmi|S|99|

