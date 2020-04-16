package com.qa.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

public class Check extends TestBase {

	public static void main(String[] args) throws IOException {
		
		String  filename  = "C:\\Users\\srinaika\\git\\automonew\\src\\test\\resources\\RMS_Transaction.txt";
		
		
		int account = 14;
		int bkno= 3;
		int accountextension = 1;
		int transdate = 9;
		int transcode  = 2;
		int transamt = 12;
		
		
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
			
			
			
		    for (int j=0; j < arrSplit.length; j++)
		    {
		      System.out.println(arrSplit[j]);
		     
		    }
			
			
		}
		
		//Read the file.
		//iterate  - line by line
//		put the value in String
//		Array  = String Split  | 
		//do Validation
 } 
}
	 
	
	

	


