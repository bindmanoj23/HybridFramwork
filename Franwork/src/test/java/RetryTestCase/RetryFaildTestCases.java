package RetryTestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFaildTestCases  implements IRetryAnalyzer{

	 private int count = 0;
	    private final int maxRetry = 2;

	    @Override
	    public boolean retry(ITestResult result) {
	        if (count < maxRetry) {
	            count++;
	            return true;  // Retry the test
	        }
	        return false;  // Don't retry
	    }

}
