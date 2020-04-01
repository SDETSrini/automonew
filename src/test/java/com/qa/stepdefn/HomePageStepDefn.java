package com.qa.stepdefn;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepDefn {
	
	WebDriver driver;
	
	@Given("^User is on HomePage$")
	public void user_is_on_HomePage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinaika\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	    
	}

	@Then("^verify title of the HomePage$")
	public void verify_title_of_the_HomePage() throws Throwable {
		String  homePageTitle  = driver.getTitle();
		System.out.println("HomePage Title is "+homePageTitle);
		driver.quit();
	    
	}

	@Then("^verify Logo of the HomePage$")
	public void verify_Logo_of_the_HomePage() throws Throwable {
	   
	}


}
