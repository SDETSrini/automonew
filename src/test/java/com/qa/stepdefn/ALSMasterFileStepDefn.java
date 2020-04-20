package com.qa.stepdefn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.qa.base.TestBase;

import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class ALSMasterFileStepDefn extends TestBase {
	
	
	int ACCOUNT_001 = 14;
	int ACLASS_02 = 2;
	int ATYP_03 = 1;
	int APR_04 = 11; //check with Prathika
	
	
	@Then("^Verify ACCOUNT Number format in ALS File$")
	public void verify_ACCOUNT_Number_format_in_ALS_File() throws Throwable {
		
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String str=null;
		ArrayList<String> lines = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    lines.add(str);
		}
		String[] linesArray = lines.toArray(new String[lines.size()]);
		
		int linesArraysize = linesArray.length;
		
		System.out.println(linesArraysize);
		
		for(int i=1;i<linesArraysize; i++)
		{
			String value  = (String) linesArray[i];
			System.out.println(value);
			
			
			String[] arrSplit = value.split("\\|");
			
			System.out.println("String Array size "+arrSplit.length);
			
			String BankAccountNumber  = arrSplit[0];
			System.out.println("Actual BankAccountNumber is"+ BankAccountNumber);
			
		int ActualBankAccountLength =	BankAccountNumber.length();
		
		Assert.assertEquals(ACCOUNT_001, ActualBankAccountLength);
		
		}
	
	   
	}


}
