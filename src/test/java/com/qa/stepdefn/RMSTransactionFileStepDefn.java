package com.qa.stepdefn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.qa.base.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class RMSTransactionFileStepDefn extends TestBase {
	
	TestBase data;
	List<Map<String, String>> CSVData;
	
	int account = 14;
	int bkno= 3;
	int accountextension = 1;
	int transdate = 8;
	int transcode  = 2;
	int transamt = 15;
	
	
	@Given("^Verify ACCOUNT Number format$")
	public void verify_ACCOUNT_Number_format() throws Throwable {
		
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String str=null;
		ArrayList<String> lines = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    lines.add(str);
		}
		String[] linesArray = lines.toArray(new String[lines.size()]);
		
		int linesArraysize = linesArray.length;
		
		System.out.println(linesArraysize);
		
		for(int i=0;i<linesArraysize; i++)
		{
			String value  = (String) linesArray[i];
			System.out.println(value);
			
			
			String[] arrSplit = value.split("\\|");
			
			System.out.println("String Array size "+arrSplit.length);
			
			String BankAccountNumber  = arrSplit[0];
			System.out.println("Actual BankAccountNumber is"+ BankAccountNumber);
			
		int ActualBankAccountLength =	BankAccountNumber.length();
		
		Assert.assertEquals(account, ActualBankAccountLength);
		
		}
	
	   
	}

	@Then("^Verify BKNO Number format$")
	public void verify_BKNO_Number_format() throws Throwable {
		
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String str=null;
		ArrayList<String> lines = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    lines.add(str);
		}
		String[] linesArray = lines.toArray(new String[lines.size()]);
		
		int linesArraysize = linesArray.length;
		
		System.out.println(linesArraysize);
		
		for(int i=0;i<linesArraysize; i++)
		{
			String value  = (String) linesArray[i];
			System.out.println(value);
			
			
			String[] arrSplit = value.split("\\|");
			
			System.out.println("String Array size "+arrSplit.length);
			
			String bknoValue  = arrSplit[1];
			System.out.println("Actual BKNO is "+ bknoValue);
			
		int ActualBKNO =	bknoValue.length();
		
		Assert.assertEquals(bkno, ActualBKNO);
		
		}
	
		
	
	    
	}

	@And("^Verify ACCOUNT EXTENSION format$")
	public void verify_ACCOUNT_EXTENSION_format() throws Throwable {
	
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String str=null;
		ArrayList<String> lines = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    lines.add(str);
		}
		String[] linesArray = lines.toArray(new String[lines.size()]);
		
		int linesArraysize = linesArray.length;
		
		System.out.println(linesArraysize);
		
		for(int i=0;i<linesArraysize; i++)
		{
			String value  = (String) linesArray[i];
			System.out.println(value);
			
			
			String[] arrSplit = value.split("\\|");
			
			System.out.println("String Array size "+arrSplit.length);
			
			String Extension  = arrSplit[2];
			System.out.println("Extension is"+ Extension);
			
		int ActualExtension =	Extension.length();
		
		Assert.assertEquals(accountextension, ActualExtension);
		
		}
		
	    
	}

	@And("^Veriy TRANDATE format$")
	public void veriy_TRANDATE_format() throws Throwable {
		
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String str=null;
		ArrayList<String> lines = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    lines.add(str);
		}
		String[] linesArray = lines.toArray(new String[lines.size()]);
		
		int linesArraysize = linesArray.length;
		
		System.out.println(linesArraysize);
		
		for(int i=0;i<linesArraysize; i++)
		{
			String value  = (String) linesArray[i];
			System.out.println(value);
			
			
			String[] arrSplit = value.split("\\|");
			
			System.out.println("String Array size "+arrSplit.length);
			
			String TransDate  = arrSplit[3];
			System.out.println("Extension is"+ TransDate);
			
		int actualTransDate =	TransDate.length();
		
		Assert.assertEquals(transdate, actualTransDate);
		
		}

	}

	@And("^Verify TRANCODE format$")
	public void verify_TRANCODE_format() throws Throwable {
		
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String str=null;
		ArrayList<String> lines = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    lines.add(str);
		}
		String[] linesArray = lines.toArray(new String[lines.size()]);
		
		int linesArraysize = linesArray.length;
		
		System.out.println(linesArraysize);
		
		for(int i=0;i<linesArraysize; i++)
		{
			String value  = (String) linesArray[i];
			System.out.println(value);
			
			
			String[] arrSplit = value.split("\\|");
			
			System.out.println("String Array size "+arrSplit.length);
			
			String TransCode  = arrSplit[4];
			System.out.println("Extension is"+ TransCode);
			
		int actualTransCode =	TransCode.length();
		
		Assert.assertEquals(transcode, actualTransCode);
		
		}
		

	   
	}

	@And("^Verfy TRANAMT format$")
	public void verfy_TRANAMT_format() throws Throwable {
		
		
		boolean transamtflag = false;	
		
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String str=null;
		ArrayList<String> lines = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    lines.add(str);
		}
		String[] linesArray = lines.toArray(new String[lines.size()]);
		
		int linesArraysize = linesArray.length;
		
		System.out.println(linesArraysize);
		
		for(int i=0;i<linesArraysize; i++)
		{
			String value  = (String) linesArray[i];
			System.out.println(value);
			
			
			String[] arrSplit = value.split("\\|");
			
			System.out.println("String Array size "+arrSplit.length);
			
			String TransAmt  = arrSplit[5];
			System.out.println("Extension is"+ TransAmt);
			
		int actualTransAmt =	TransAmt.length();
		
		System.out.println(actualTransAmt);
		
		if(actualTransAmt<=transamt)
		{
			transamtflag = true;
		}
		
		Assert.assertTrue(transamtflag);

		}
		

	    
	}

}
