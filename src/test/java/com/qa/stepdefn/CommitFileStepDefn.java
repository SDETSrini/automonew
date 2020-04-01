package com.qa.stepdefn;

import java.io.File;

import com.qa.base.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class CommitFileStepDefn extends TestBase {
	
	
	String filename;
	boolean flag = false;
	
	
	@Given("^User is having the File \"([^\"]*)\" in drop location$")
	public void user_is_having_the_File_in_drop_location(String arg1) throws Throwable {
		
		filename  = "C:\\Users\\srinaika\\git\\automonew\\src\\test\\resources\\" + arg1;
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
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Verify File Header Record Number of Records$")
	public void verify_File_Header_Record_Number_of_Records() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Verify File Header Record Function$")
	public void verify_File_Header_Record_Function() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Verify File Header Record ALS Bank Number$")
	public void verify_File_Header_Record_ALS_Bank_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Verify File Header Record ALS Account Number$")
	public void verify_File_Header_Record_ALS_Account_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Verify File Header Record CLN Pool$")
	public void verify_File_Header_Record_CLN_Pool() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



	
	}


