package RetryTestCase;

import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnotationTransformer implements IAnnotationTransformer {

	 public void transform(ITestAnnotation annotation, Class testClass, Method testMethod) {
	        
	       annotation.setRetryAnalyzer(RetryFaildTestCases.class); 
	    }
	
}
