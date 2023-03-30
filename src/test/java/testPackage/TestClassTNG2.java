package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTNG2 {
	
	@Parameters({"browserName"})
	@BeforeTest
	public void beforeTest(String browserName)
	{
		if (browserName.equals("chrome"))
				{
			System.out.println("opening the chrome browser");
				}
		else if
		(browserName.equals("firefox"))
		{
	System.out.println("opening the firefox browser");
		}
		
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass2");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod2");
	}
	@Test
	public void test1()
	{
		System.out.println("test1 of class2");
	}
	@Test
	public void test2()
	{
		System.out.println("test2 of class2");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass of 2");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest of class2");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite of class2 ");
	}
	

}
