Feature: Login SaleFore Application

Scenario Outline:EditIndividual mulitple data
Given Click on App Launcher 
And Click on View All link
And Click On individual link
And Search the individual name as <name>
And Click on the Edit link to Edit
And Select Salutation as mr
Given Enter the firstname as <firstname>
And Click on Save button
Then Verifiy the firstname should be dispaly

Examples:
|name|firstname|
|Soundararajan|Ajay|
