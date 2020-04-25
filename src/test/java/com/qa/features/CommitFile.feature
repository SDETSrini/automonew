Feature: Verification of Commit File

@Progression
Scenario Outline: Verify Commit File format
Given User is having the File "<FileName>" in drop location
Then verify file format

Examples:
		| FileName |
		| Commit.csv |

		
@Progression
Scenario Outline: Verify Commit File Layout Structure
Given User is having the File "<FileName>" in drop location
And Verify File Header Record ALS Bank Number
And Verify File Header Record ALS Account Number
And Verify File Header Record CLN Pool

Examples:
		| FileName |
		| Commit.csv |
