package RetryTestCase;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;



public class TestListner implements ITestListener {
	
	  @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Test Started: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Test Passed: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test Failed: " + result.getName());
	        System.out.println("Reason: " + result.getThrowable());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Test Skipped: " + result.getName());
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        // Optional - rarely used
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        System.out.println(" Test Suite Started: " + context.getName());
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        System.out.println("Test Suite Finished: " + context.getName());
	    }
	 @Test
	    public void testPass() {
	        System.out.println("Running testPass...");
	        assert true;
	    }

	    @Test
	    public void testFail() {
	        System.out.println("Running testFail...");
	        assert false;
	    }

	    @Test(dependsOnMethods = {"testFail"})
	    public void testSkipped() {
	        System.out.println("This will be skipped because testFail failed.");
	    }

}
