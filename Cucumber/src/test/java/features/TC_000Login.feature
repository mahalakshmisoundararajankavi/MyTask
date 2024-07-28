Feature: Login the SaleForce Application

Scenario Outline:Login the application
Given Enter the username as <username>
And Enter the password as <password>
When Click on login button

Examples:
|username|password|
|maha@testleaf.com|Test@1234|
|maha@testleaf.com|test@1234|
