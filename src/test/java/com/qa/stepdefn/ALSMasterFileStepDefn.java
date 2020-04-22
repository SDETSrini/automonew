package com.qa.stepdefn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.qa.base.TestBase;

import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class ALSMasterFileStepDefn extends TestBase {
	
	@Then("^Verify \"([^\"]*)\" is having length of \"([^\"]*)\" in position \"([^\"]*)\"$")
	public void verify_is_having_length_of_in_position(String arg1, String arg2, String arg3) throws Throwable {
		
		String field = arg1;
		int len = Integer.valueOf(arg2);
		int pos = Integer.valueOf(arg3);
				
		
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
			
			String expectedvalue  = arrSplit[pos];
			System.out.println(arg1 + "Value is"+ expectedvalue);
			
			if(!expectedvalue.isEmpty())
			{
					
				int Actualvalue =	expectedvalue.length();
				Assert.assertEquals(len, Actualvalue);
			}
		
		}
	
	   
	}


}
