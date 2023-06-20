Feature: Login functionality of Leaftaps Application

Background:
Given Open the chrome browser
And Load the url
And Load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button



Given User is on the Leads page
When User clicks on Find Leads
And  Enters the firstname as <firstname>
And Clicks on Find Leads button
And Selects the lead with name Mahalakshmi
And Clicks on Duplicate Lead button
And Updates the first name as <firstnameupdate>
And Clicks on Create Lead button
Then Lead should be duplicated successfully with the updated <firstNameUpdate>

Examples:
|firstname|firstnameupdate|
|Mahalaskhmi|Sherin|
