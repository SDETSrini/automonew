Feature: Verification of Commit File

@Sanity
Scenario Outline: Verify Commit File format
Given User is having the File "<FileName>" in drop location
Then verify file format

Examples:
		| FileName |
		| Commit.csv |

		
#Check with		
#Scenario Outline: Verify Commit File Name Pattern	

@Sanity
Scenario Outline: Verify Commit File Layout Structure
Given User is having the File "<FileName>" in drop location
Then Verify File Header Record Date
And Verify File Header Record Number of Records
And Verify File Header Record Function
And Verify File Header Record ALS Bank Number
And Verify File Header Record ALS Account Number
And Verify File Header Record CLN Pool

Examples:
		| FileName |
		| Commit.csv |
