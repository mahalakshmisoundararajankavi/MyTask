Feature: Login functionality of Leaftaps Application

Scenario: Login for positive credentials
Given Open the chrome brower
And Load the url
And Enter the username as 'Demosalemanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed

Scenario: Login for positive credentials
Given Open the chrome brower
And Load the url
And Enter the username as 'Demosalemanager'
And Enter the password as 'crmsf'
When Click on Login button
But Error Message should be displayed