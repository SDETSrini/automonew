package com.qa.stepdefn;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.qa.base.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class CommitFileStepDefn extends TestBase {
	
	
	String filename;
	boolean flag = false;
	boolean flagnew;
	
	int actualALSAccountNumber = 10;
	int actualALSBankNumber= 3;
	int actualCLNPool = 12;
	
	TestBase data;
	List<Map<String, String>> CSVData;
	
	
	@Given("^User is having the File \"([^\"]*)\" in drop location$")
	public void user_is_having_the_File_in_drop_location(String arg1) throws Throwable {
		
		filename  = System.getProperty("user.dir") + "\\src\\test\\resources\\" + arg1;
		System.out.println(filename);
		
	}    
	

	@Then("^verify file format$")
	public void verify_file_format() throws Throwable {
		

		String extension = getFileExtension(new File(filename));
        System.out.println("File Extension :- " + extension);
        
        
        extension=  extension.replace(".", "");
        System.out.println("Extension of the file after the method"+extension);
        
        if(extension.equalsIgnoreCase("csv"))
        {
        	flag = true;
        }

        Assert.assertTrue(flag);
 
	}
	
	
	@Then("^Verify File Header Record Date$")
	public void verify_File_Header_Record_Date() throws Throwable {

		data = new TestBase();

		CSVData = data.ReadDataFromCSVFile(filename);
		
		System.out.println(CSVData);
		
		Map<String, String> firstRow = CSVData.get(0);
		
		System.out.println(firstRow);
		
		if(firstRow.containsKey("add"))
		{ 
			flag =true;
		}
		System.out.println(flag);
		
	}

	@Then("^Verify File Header Record Number of Records$")
	public void verify_File_Header_Record_Number_of_Records() throws Throwable {
		
		System.out.println("Number of Records in the file is "+CSVData.size());
	    
	}

	@Then("^Verify File Header Record Function$")
	public void verify_File_Header_Record_Function() throws Throwable {
		
		
	  
	}

	@Then("^Verify File Header Record ALS Bank Number$")
	public void verify_File_Header_Record_ALS_Bank_Number() throws Throwable {
		
		data = new TestBase();

		CSVData = data.ReadDataFromCSVFile(filename);
		
		System.out.println(CSVData);
		
		
		for (int i =0; i<CSVData.size(); i++)
		{
			
			String alsbanknumber = CSVData.get(i).get("als bank number");				
			System.out.println(alsbanknumber);
			
			int expectedALSBankNumber  = alsbanknumber.length();
			
			//ALS Bank Number should be of 3 			
			Assert.assertEquals(expectedALSBankNumber, actualALSBankNumber);
			
						
		}	
		
		
	   
	}

	@Then("^Verify File Header Record ALS Account Number$")
	public void verify_File_Header_Record_ALS_Account_Number() throws Throwable {
		
	
		for (int i =0; i<CSVData.size(); i++)
		{
			
			String AccNo = CSVData.get(i).get("als account number");				
			System.out.println(AccNo);
			
			int accountlength  = AccNo.length();
			
			//Account Number should be of 10 digit				
			Assert.assertEquals(accountlength, actualALSAccountNumber);
			
						
		}	
	  
	}

	@Then("^Verify File Header Record CLN Pool$")
	public void verify_File_Header_Record_CLN_Pool() throws Throwable {
		
		for (int i =0; i<CSVData.size(); i++)
		{
			
			String clnpool = CSVData.get(i).get("cln pool");				
			System.out.println(clnpool);
			
			int expectedclnpool  = clnpool.length();
			
			//CLN Pool should be of 12 
			Assert.assertEquals(expectedclnpool, actualCLNPool);
					
		}	
	   
	}



	
	}


