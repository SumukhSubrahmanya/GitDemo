package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ItestListener interface which implements TestNG listeners
public class Listeners implements ITestListener{
	
	 @Override
	    public void onTestStart(ITestResult result) { }

	    @Override
	    public void onTestSuccess(ITestResult result) { 
	    	//System.out.println("I successfully executed Listeners Pass Code");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	    	//screenshot code
	    	//response if API failed
	    	System.out.println("I failed executing the Listeners Pass Code "+result.getName());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) { }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) { }

	    @Override
	    public void onStart(ITestContext context) { }

	    @Override
	    public void onFinish(ITestContext context) { }

}

