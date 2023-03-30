package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassTNG {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass1");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod1");
	}
	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("test1 of 1");

	}
	@Test
	public void test2()
	{
		System.out.println("test2 of 1");
	}
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass1");
	}

}
