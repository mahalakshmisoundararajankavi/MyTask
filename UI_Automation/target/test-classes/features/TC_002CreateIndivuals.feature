Feature: Salesforce Login and Individual Creation


 Scenario Outline: Login to Salesforce and Create a New Individual
Given Enter the username as <username>
And Enter the password as <password>
When Click on login button
Then verifiy title name should be disaply 
When Click on the app launcher 
And Click on View  All link
And I scroll to the Party Consent section
And I click on the Individuals section
And click on individual link
And click on the new individual creation link
And I select the title mr
Given Enter the lastname as <lastname>
And Click on save button
Then Verifiy name should be display

Examples:
|username|password|lastname|
|maha@testleaf.com|Test@1234|Soundararajan|
|maha@testleaf.com|Test@1234|S|
