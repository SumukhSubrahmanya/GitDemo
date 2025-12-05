package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class BasicsTestNG {

	@Test
	public void demo() {
		System.out.println("Hello");
		//code by gitdemo
		System.out.println("World");
		System.out.println("Hello World");
		
		//code by gitX
		System.out.println("Bye");
		System.out.println("World");
		System.out.println("Bye World");
		Assert.assertTrue(false);
	}
	
	@Test(groups= {"smoke"})
	public void SecondTest() {
		System.out.println("Bye");
	}
	
	@AfterSuite
	public void AfterSuiteTest()
	{
		System.out.println("I am the no 1 from the last");
	}

}
