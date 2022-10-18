package php.crm.Vtiger.project2.campaignTest;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Practice1 {
	
	@Test(priority=1)
	
	
	public void b() {
		
		
		
		 //Hard Assert
		  
		  	String ActualResult = "abc";
		String ExpectedResult = "abc";
		
		
		Assert.assertEquals(ActualResult, ExpectedResult);
		 System.out.println("Campaign Name is Verifed");

		
		
		
		//Soft assert Concept
		
		boolean ActualBooleanResult = true;
		boolean ExpectedBooleanResult = false;
		
		int actualIntResult = 123;
		int ExpectedIntResult = 123;
		
		String actualStringResult = "abc";
		String ExpectedStringResult = "abc";
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(ActualBooleanResult, ExpectedBooleanResult);
		System.out.println("Pass1");
		
		s.assertEquals(actualIntResult, ExpectedIntResult);
		System.out.println("Pass2");
		
		
		s.assertEquals(actualStringResult, ExpectedStringResult);
		System.out.println("Pass3");
		s.assertAll();
	}
		
		

		
		
		@Test(priority=-6)
		
		public void a() {
			
			
			boolean ActualBooleanResult = true;
			boolean ExpectedBooleanResult = false;
			
			int actualIntResult = 123;
			int ExpectedIntResult = 123;
			
			String actualStringResult = "abc";
			String ExpectedStringResult = "abc";
			
			SoftAssert s = new SoftAssert();
			s.assertEquals(ActualBooleanResult, ExpectedBooleanResult);
			System.out.println("Pass4");
			
			s.assertEquals(actualIntResult, ExpectedIntResult);
			System.out.println("Pass5");
			
			s.assertEquals(actualStringResult, ExpectedStringResult);
			System.out.println("Pass6");
			s.assertAll();
			
		

}
}
