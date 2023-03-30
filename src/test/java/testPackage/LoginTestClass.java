package testPackage;

import static org.testng.Assert.fail;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pomPackage1.LoginPage;
import testUtility.ReadFileData;

public class LoginTestClass extends BaseClass {
	ReadFileData r;
	LoginPage login;
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeclass");
	login= new LoginPage(driver);
	}
	@Test
	public void VerifyLoginFunctionalityWithCorrectData() throws EncryptedDocumentException, IOException
	{	
		SoftAssert s=new SoftAssert();
//		System.out.println("driver="+driver);
	    logger=report.createTest("Verify login functionality with correct data");
        login.sendUsername(r.fetchDataFromExcel(1, 0));
        login.sendPassword(r.fetchDataFromExcel(1, 1));
        login.clickOnLoginButton();
        s.assertTrue(true);
        s.assertAll();
 //       logger.pass("Test case is pass");
	}
	@Test
	public void VerifyLoginFunctionalityWithIncorrectData()
	{
		logger=report.createTest("Verify login functionality with incorrect data");
        login.sendUsername("admin");
        login.sendPassword("admin1234");
        login.clickOnLoginButton();
        String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String currentURL=driver.getCurrentUrl();
        Assert.assertNotEquals(currentURL, expectedURL);
        Assert.fail();
	}
	


}
