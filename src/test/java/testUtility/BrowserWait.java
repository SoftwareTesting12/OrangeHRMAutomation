package testUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class BrowserWait 
{
	public static void waitForBrowser(int timeout, WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}

}
