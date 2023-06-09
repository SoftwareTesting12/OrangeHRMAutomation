package pomPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement SearchBox;
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement AdminTab;
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIM;
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement LeaveTab;
	@FindBy(xpath="//span[text()='Time']") 
	private WebElement TimeTab;
	@FindBy(xpath="//span[text()='Recruitment']")
	private WebElement RecruitmentTab;
	@FindBy(xpath="//span[text()='My Info']")
	private WebElement MyInfoTab;
	@FindBy(xpath="//span[text()='Performance']']")
	private WebElement PerformanceTab;
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement DashboardTab;
	@FindBy(xpath="//span[text()='Directory']")
	private WebElement DirectoryTab;
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement MaintenanceTab;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void typeInSearch()
	{
		SearchBox.sendKeys("ad");
		AdminTab.click();
	}
	public boolean clickOnAdminTab()
	{
		AdminTab.click();
		String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		String currentURL=driver.getCurrentUrl();
		boolean result=expectedURL.equalsIgnoreCase(currentURL);
		return result;
	}

}
