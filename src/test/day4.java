package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Parameters({"URL" , "APIkey/username"})
	@Test
	public void WebLoginHomeLoan(String urlname,String username)
	{
		//Selenium
		System.out.println("WebLoginHome");
		System.out.println(urlname);
		System.out.println(username);
	}
	
	@Test(groups= {"smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileLoginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("APILoginHome");
	}

}
