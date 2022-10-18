package php.crm.Vtiger.project2.pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CampaignDetailsPage {
	

	WebDriver driver;
	public CampaignDetailsPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    	this.driver=driver;
    	
    }
	
	public String verifyCampaignDetailsPage(String campaignName) {
		return driver.findElement(By.xpath("//span[contains(text(),'"+campaignName+"')]")).getText();
		
	}
	
	
}
