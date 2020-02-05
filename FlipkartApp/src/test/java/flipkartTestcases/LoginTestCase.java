package flipkartTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.WrapperClass;
import pagesApp.LoginPage;

public class LoginTestCase extends WrapperClass{
	LoginPage lp ;
	@BeforeTest
	public void startUp()
	{
		launchApplication("chrome", "https://www.flipkart.com/");
	}
	@Test(priority = 1)
	public void login()
	{
		lp=new LoginPage(driver);
		String rectext =lp.login();
		Assert.assertTrue(rectext.contains("enter valid Email ID"));
	}
	@Test(priority = 2)
	public void createacc()
	{
		String text=lp.createAcc();
		Assert.assertTrue(text.contains(" Mobile number"));
	}
	@AfterTest
	public void close()
	{
		//quit();
	}

}
