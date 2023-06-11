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
Given Click on the Leads link
When Click on the Find Leads link
And Click on the Phone Number
And Enter the PhoneNumber as <phoneNumber>
And Click the Find Leads button
And Click on the first lead in the search results
And Click on the Delete link
And Click on the Find Leads link
And Enter the lead ID in the search field
And Click the Find Leads button
Then I should see the message No records to display
Then I should see the message Lead deleted successfully
Examples:
|phoneNumber|
|1 123|
|91|

