package php.crm.Vtiger.project2.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
			
		}
		@FindBy(id ="username")
		private WebElement usernameTextField;
		
		@FindBy(id ="password")
		private WebElement passwordtextField;
		
		@FindBy(xpath ="//button[text()='Sign in']")
		private WebElement signInButton;

		public WebElement getUsernameTextField() {
			return usernameTextField;
		}

		public WebElement getPasswordtextField() {
			return passwordtextField;
		}

		public WebElement getSignInButton() {
			return signInButton;
		}
		
		public void LoginAction(String username,String password ) {
			
			usernameTextField.clear();
			usernameTextField.sendKeys(username);
			passwordtextField.clear();
			passwordtextField.sendKeys(password);
			signInButton.click();
			
			
			
		}
		
		
		
		

	

}
