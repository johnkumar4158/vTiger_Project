package php.crm.Vtiger.project2.pomRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewCampaignsPage {

	
		
		public CreatingNewCampaignsPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="Campaigns_editView_fieldName_campaignname")
		private WebElement campaignNameTextField;
		
		@FindBy(id="Campaigns_editView_fieldName_closingdate")
		private WebElement expectedClosingDateCalender;
		
		@FindBy(xpath="//button[text()='Save']")
		private WebElement saveButton;

		public WebElement getCampaignNameTextField() {
			return campaignNameTextField;
		}

		public WebElement getExpectedClosingDateCalender() {
			return expectedClosingDateCalender;
		}

		public WebElement getSaveButton() {
			return saveButton;
		}
		
		public void createNewCampaignAction(String campaignName, String Date) {
			campaignNameTextField.sendKeys(campaignName);
			expectedClosingDateCalender.sendKeys(Date);
			expectedClosingDateCalender.sendKeys(Keys.ENTER);
			saveButton.click();
		}
		
	}


