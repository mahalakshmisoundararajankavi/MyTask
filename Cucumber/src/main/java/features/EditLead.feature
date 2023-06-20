Feature: Login functionality of Leaftaps Application

Background:
Given Open the chrome browser
And Load the url
And Load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed

Scenario Outline: Edit for positive credentails
Given Click on the Leads link
When Click on the Find Leads link
And Click on the Phone Number 
And Enter  in the phone number  as <phoneNumber>
And Click the Find Leads button
And Click on the first lead in the search results
And Click on the Edit link
And Clear the Company Name  
And Enter the Company Name as <companyName>
And Click the Submit button
And Should see the updated company name as 'TCS'
Then Should see the message Lead is edited successfully
Then Close a browser
Examples:
|phoneNumber|companyName|
|99|TCS|
|99|TestLeaf|
    