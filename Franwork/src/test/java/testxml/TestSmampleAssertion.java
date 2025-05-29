package testxml;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.util.Assert;

import RetryTestCase.AnotationTransformer;
import RetryTestCase.RetryFaildTestCases;



public class TestSmampleAssertion {
	
	
	@Test
	public void test1() {
		int a=200;
		int b=100;
		
		int i=1/0;
	//org.testng.Assert.assertEquals(b, a);// error- Hard Assert
	SoftAssert sa=new SoftAssert();// soft assert
	sa.assertEquals(b, a);
	System.out.println("manoj");
	sa.assertAll();// last me write  if test case fail colour blue		  
		
	}
	@Test
	
	public void test2() {
		
		int a=1/0;
		
		String x="ram";
		String y="ram";
		org.testng.Assert.assertEquals(x, y);
		
		System.out.println("complete");
	}
	@Test
	public void test3() {
		String name1="Ram";
		String name2="Ram";
		//org.testng.Assert.assertNotEquals(name1, name2);
	SoftAssert sa=	new SoftAssert();
	sa.assertNotEquals(name1, name2);
		System.out.println(name2+name2);
		sa.assertAll();
		
		
	}
}
