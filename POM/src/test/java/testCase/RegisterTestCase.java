package testCase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.WrapperEx;
import pages.RegisterPage;

public class RegisterTestCase extends WrapperEx{
//Test ng code
	@BeforeTest
	public void startUp()
	{
		launchApplication("chrome", "https://www.facebook.com/");
	}
	@Test
	public void register()
	{
		RegisterPage reg = new RegisterPage(driver);
		reg.registerFirstname("Malar");
		reg.registerLastname("Pal");
		reg.registerMobileorEmail("3213131");
		reg.registerNewpwd("pass");
		reg.registerMonth("3");
		reg.registerDate(5);
		reg.registerYear("2020");
		reg.registerFemale();
		reg.registerSignup();
	}
	@AfterTest
	public void close()
	{
		//quit();
	}
}
