Feature: Verification of ALS Master File

@Progression1
Scenario Outline: Verification of ALS Master File Layout Structure
Given User is having the File "<FileName>" in drop location
Then Verify ACCOUNT Number data format in ALS File

Examples:
		| FileName										 |
		| ALS Master File Extract- UTTI Unit test.txt	 |