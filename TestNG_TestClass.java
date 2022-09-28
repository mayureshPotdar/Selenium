package TestNG_Package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_TestClass {
	
	@BeforeSuite
	public void test1() {
		System.out.println("Inside Before Suite");
	}
	
	@BeforeTest
	public void test2() {
		System.out.println("Inside Before Test");
	}
	
	@BeforeClass
	public void test3() {
		System.out.println("Inside Before Class");
	}
	
	@BeforeMethod
	public void test4() {
		System.out.println("Inside Before Method");
	}
	
	@Test
	public void testS1() {
		System.out.println("S1");
	}
	
	@AfterMethod
	public void test5() {
		System.out.println("Inside After Method");
	}
	
	@AfterClass
	public void test6() {
		System.out.println("Inside After Class");
	}
	
	@AfterTest
	public void test7() {
		System.out.println("Inside After Test");
	}
	
	@AfterSuite
	public void test8() {
		System.out.println("Inside After Suite");
	}
	
}

//This is the flow of TestNG 
