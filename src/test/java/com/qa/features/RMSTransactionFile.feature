Feature: Verification of RMS Transaction File

@Progression
Scenario Outline: Verification of RMS Transaction File Layout Structure
Given User is having the File "<FileName>" in drop location
Then Verify ACCOUNT Number format
And Verify BKNO Number format
And Verify ACCOUNT EXTENSION format
And Veriy TRANDATE format
And Verify TRANCODE format
And Verfy TRANAMT format

Examples:
		| FileName				 |
		| RMS_Transaction.txt	 |