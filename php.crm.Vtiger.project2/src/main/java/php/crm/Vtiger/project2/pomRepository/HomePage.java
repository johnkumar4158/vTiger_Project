package php.crm.Vtiger.project2.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {




	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id ="appnavigator")
	private WebElement threeDashButton;
	
	@FindBy(xpath ="//span[text()=' MARKETING']")
	private WebElement marketingOption;
	
	@FindBy(xpath="//span[text()=' Campaigns']")
	private WebElement CampaignOption;
	
	@FindBy(xpath ="//a[@class='userName dropdown-toggle pull-right']")
	private WebElement logoutButton;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutbutton;

	public WebElement getThreeDashButton() {
		return threeDashButton;
	}

	public WebElement getMarketingOption() {
		return marketingOption;
	}

	public WebElement getCampaignOption() {
		return CampaignOption;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getSignoutbutton() {
		return signoutbutton;
	}

	

	
	public void clickCampaignOption() {
		
		threeDashButton.click();
		
		marketingOption.click();
		CampaignOption.click();
		
	}
	
	public void logout() { 
		
		logoutButton.click();
		signoutbutton.click();
		
		
		
	}
}
	
