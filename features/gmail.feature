
Feature: Gmail  Login Feature

Scenario Outline: Gmail Login Test Scenario

Given user is already on Login Page
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then the user click on last mail

Examples:
	| username                  | password |
	| aishwaryapk2009@gmail.com | ashisthebest |
	

