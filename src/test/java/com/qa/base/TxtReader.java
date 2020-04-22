package com.qa.base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class TxtReader extends TestBase {

	public static void main(String[] args) throws IOException {
		
		int account = 14;
		int bkno= 3;
		int accountextension = 1;
		int transdate = 8;
		int transcode  = 2;
		int transamt = 15;
				
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
		// TODO Auto-generated method stub

	}


