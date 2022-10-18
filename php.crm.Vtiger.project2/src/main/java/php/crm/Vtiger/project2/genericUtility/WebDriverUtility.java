package php.crm.Vtiger.project2.genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(IPathConstant.IMPLICT_WAIT, TimeUnit.SECONDS);
		}
	public void waitForTheElementToBeClickable(WebDriver driver,WebElement elemnet) {
		
		WebDriverWait wait=new WebDriverWait(driver, IPathConstant.EXPLICT_WAIT);
		wait.until(ExpectedConditions.elementToBeClickable(elemnet));
	}
	
	public void waitForTheTitle(WebDriver driver,String title) {
		
		WebDriverWait	wait=new WebDriverWait(driver,IPathConstant.EXPLICT_WAIT);
				 wait.until(ExpectedConditions.titleContains(title));
		
	}
	
	public void maximizeWindow(WebDriver driver) {
	driver.manage().window().maximize();
	}
	

}
