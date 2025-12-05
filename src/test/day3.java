package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void befoClass()
	{
		System.out.println("Before executing any methods in the class--");
		System.out.println("--THIS WILL BE EXECUTED");
	}

	
	@AfterClass
	public void aftClass()
	{
		System.out.println("After executing any methods in the class--");
		System.out.println("--THIS WILL BE EXECUTED");
		
	}
	
	@AfterTest
	public void CarLoanLast()
	{
		//Rest API automation
		System.out.println("I will execute Last");
		
	}
	
	@Parameters({"URL"})
	@Test(timeOut=4000)
	public void WebLoginCarLoan(String urlName) {
		// Selenium
		System.out.println("WebLoginCar");
		System.out.println(urlName);
	}
	
	@BeforeMethod
	public void beforeEvery() {
		// Selenium
		System.out.println("I will execute before every test in day class");
	}
	
	@AfterMethod
	public void afterEvery() {
		// Selenium
		System.out.println("I will execute after every test in day class");
	}

	@Test(groups= {"smoke"})
	public void MobileLoginCarLoan() {
		// Appium
		System.out.println("MobileLoginCar");
	}
	
	@BeforeSuite
	public void BeforeSuiteTest()
	{
		System.out.println("I am the no 1");
	}
	
	@Test(enabled=false)
	public void MobilesigninCarLoan() {
		// Appium
		System.out.println("Mobile signin");
	}

	@Test(dataProvider="getData")
	public void MobilesignoutCarLoan(String username,String password) {
		// Appium
		System.out.println("Mobile signout");
		System.out.println("User Name = "+username);
		System.out.println("Password = "+password);
	}

	@Test(dependsOnMethods={"WebLoginCarLoan","MobilesignoutCarLoan"})
	public void APIcarLoan() {
		// Rest API automation
		System.out.println("APILoginCar");
	}

	@BeforeTest
	public void CarLoanFirst() {
		// Rest API automation
		System.out.println("I will execute first");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - user name , password --> Good credit history
		//2nd user name , password --> no credit history
		//3rd user name , password ---> fraudulent credit history 
		Object[][] data = new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="password";
		//columns in the row are nothing but the values for the particular combination
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		
		return data;
	}
}
