package smoke;

import org.testng.annotations.Test;

//import base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateLogin {
	
	@Test
	public void validateLoginTest()
	{
		ApplicationKeywords app=new ApplicationKeywords();
		app.beforeTest();
		app.startBrowser();
		
		app.launchApp();
		
		app.loginWithDefaultData();
		
		app.verifyTitle("Adactin.com - Search Hotel");
		
	}

}