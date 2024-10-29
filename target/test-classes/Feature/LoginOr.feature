#Author: your.email@your.domain.com

Feature: OrangrHRM login page

Background:
Given admin is on login page orangehrm

Scenario: login with valid credantials orangehrm
When user enter correct username "Admin" and correct password "admin123"
Then user is directed to home page containing "Dashboard"

Scenario: login with invalid credantials orangehrm
When user enter wrong username "admin123" and correct password "admin123"
Then an error message is out containing "Invalid credentials"