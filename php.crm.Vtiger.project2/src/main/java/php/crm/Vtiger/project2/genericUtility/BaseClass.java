package php.crm.Vtiger.project2.genericUtility;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;
import php.crm.Vtiger.project2.pomRepository.HomePage;
import php.crm.Vtiger.project2.pomRepository.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sDriver;

	public JavaUtility jutils = new JavaUtility();
	WebDriverUtility wUtils= new WebDriverUtility();
	
	@BeforeSuite
	public void bsConfig() {
         System.out.println("Data Base Connection has been established");

	}
	
	@BeforeClass
	public void bcConfig() throws IOException {
		
		String url = jutils.fetchDateFromPropertyFile("url");
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 wUtils.maximizeWindow(driver);
		 wUtils.implicitWait(driver);
		 driver.get(url);
		 System.out.println("Chrome Browser is launched");
		 System.out.println("Navigated to Vtiger");
		 sDriver=driver;
	}

		 @BeforeMethod
		 public void bmConfig() throws IOException {
			 
			 String username = jutils.fetchDateFromPropertyFile("username");
			 String password = jutils.fetchDateFromPropertyFile("password");
			 LoginPage login=new LoginPage(driver);
			 login.LoginAction(username, password);
			 System.out.println("Logout Action has been completed");
		 }
		 
		 @AfterMethod
		 public void amConfig() {
			HomePage home = new HomePage(driver);
			 home.logout();
			 System.out.println("Logout Action has been completed");
		 }
		 
		 @AfterClass
		 public void acConfig() {
			 driver.quit();
			 System.out.println("Browser is closed");
		 }
		 
		 @AfterSuite
		 public void asConfig() {
			 System.out.println("DataBase connections has been closed");
		 }
		 
	}


