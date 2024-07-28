Feature: Login functionality of Leaftaps Application

Background:
Given Open the chrome browser
And Load the url
And Load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed

Scenario Outline: Merge for positive credentails
Given Click on the Leads link
When Click on the Merge Leads link
And Click on the Lookup icon
And Switch to the new window
And Enter Mahalakshmi in the firstname as <firstNameFrom>
And Click on the Find Leads button
And Select the first lead in the search results
And Switch back to the main window
And Click on the second Lookup icon
And Switch to the new window
And Enter in the first name as <firstNameTo>
And Click the Find Leads button
And Select the second lead in the search results
And Switch back to the main window
And Click on the Merge button
And Accept the alert
And Click on the Find Leads link
And Enter the Lead ID in the search 
And Click the Find Leads button
Then I should see the message "No records to display"
Examples:
|firstNameFrom|firstNameTo|
|Mahalakshmi|Maha|