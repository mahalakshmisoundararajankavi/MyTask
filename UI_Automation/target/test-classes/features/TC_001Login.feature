Feature: Login the salesfroce application


Scenario Outline:: Login the application for multiple data
Given Enter the username as <username>
And Enter the password as <password>
When Click on login button
Then verifiy title name should be disaply 

Examples:
|username|password|
|maha@testleaf.com|Test@1234|
|maha@testleaf.com|test@1234|
