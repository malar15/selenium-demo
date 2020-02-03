package testCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import library.WrapperEx;
import pages.LoginPage;

public class LoginPgTestcase extends WrapperEx {

	@BeforeClass
	public void startUp()
	{
		launchApplication("chrome", "https://www.facebook.com/");
	}
	@Test
	public void login()
	{
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp_username("welcome");
		lp.loginToApp_password("welcome123");
		lp.loginToApp_loginButton();
		
	}
	@AfterClass
	public void close() {
		quit();
	}
}
