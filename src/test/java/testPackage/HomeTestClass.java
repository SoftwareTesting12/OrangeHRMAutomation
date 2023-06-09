package testPackage;

import org.testng.annotations.BeforeClass;

import pomPackage1.HomePage;

public class HomeTestClass extends BaseClass{
	HomePage home;
	@BeforeClass
	public void beforeClass()
	{
		 home=new HomePage( driver);
	}
	

}
