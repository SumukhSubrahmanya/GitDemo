package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class BasicsTestNG {

	@Test
	public void demo() {
		System.out.println("Hello");
		System.out.println("World");
		System.out.println("Hello World");
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
