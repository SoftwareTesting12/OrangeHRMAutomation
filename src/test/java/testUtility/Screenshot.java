package testUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static String capturePageScreenshot(WebDriver driver) throws IOException
	{
//		D:\\Eclipse workspace\\OrangeHRM\\
//		String r=System.getProperty("user.dir");
//		System.out.println(r);
		String path=System.getProperty("user.dir")+File.separator+"test-output"+File.separator+"Screenshots"+File.separator+System.currentTimeMillis()+".png";
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File destination=new File(path);
	    FileHandler.copy(source, destination);
	    return path;
	
	}

}
