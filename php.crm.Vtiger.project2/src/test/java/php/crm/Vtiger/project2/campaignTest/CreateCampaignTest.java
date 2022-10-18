package php.crm.Vtiger.project2.campaignTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;


import php.crm.Vtiger.project2.genericUtility.BaseClass;
import php.crm.Vtiger.project2.genericUtility.ExcelUtility;
import php.crm.Vtiger.project2.genericUtility.IPathConstant;
import php.crm.Vtiger.project2.pomRepository.CampaignDetailsPage;
import php.crm.Vtiger.project2.pomRepository.CampaignsPage;
import php.crm.Vtiger.project2.pomRepository.CreatingNewCampaignsPage;
import php.crm.Vtiger.project2.pomRepository.HomePage;


@Listeners(php.crm.Vtiger.project2.genericUtility.ListenerImplementationClass.class)
public class CreateCampaignTest extends BaseClass {
	
	@Test//(retryAnalyzer=php.crm.Vtiger.project2.genericUtility.IRetryAnalyserImplementationClass.class)
	
	public void CreateCampaignAndVerifyCampaignName() throws EncryptedDocumentException, IOException {
		Assert.fail();
		HomePage home = new HomePage(driver);
		home.clickCampaignOption();
		
		CampaignsPage campaign = new CampaignsPage(driver);
		campaign.clickonaddCampaign();
		
		int randomNo = jutils.generateRandomNumber( IPathConstant.RANDOM_NUMBER);
		
		
		ExcelUtility eUtils = new ExcelUtility();
		String campaignName = eUtils.fetchDataFromExcelFile( IPathConstant.SHEET_NAME, 1, 0);
		String expectedCampaignName=campaignName+randomNo;
		String date = eUtils.fetchDataFromExcelFile( IPathConstant.SHEET_NAME, 1, 1);
		
		CreatingNewCampaignsPage  newCampaignPage= new CreatingNewCampaignsPage(driver);
		 newCampaignPage.createNewCampaignAction(expectedCampaignName, date);
		
		 
		 
		CampaignDetailsPage CampaignDetails=new CampaignDetailsPage(driver);
		String actualCampaignname=CampaignDetails.verifyCampaignDetailsPage(campaignName);
		Assert.fail();
		System.out.println(actualCampaignname);
		System.out.println(expectedCampaignName);
		 
		 AssertJUnit.assertEquals(actualCampaignname, expectedCampaignName);
		 System.out.println("Campaign Name is Verifed");

		
	}

}
