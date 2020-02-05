package flipkartTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.WrapperClass;

import pagesApp.SearchPage;

public class SearchTestCase extends WrapperClass{
	
	
	@BeforeTest
	public void startUp()
	{
		launchApplication("chrome", "https://www.flipkart.com/");
	}
	@Test
	public void search()
	{
		SearchPage ser = new SearchPage(driver);
		String res=ser.search();
		Assert.assertTrue(res.contains("results for \"shoes\""));
	}
	
	@AfterTest
	public void close()
	{
		//quit();
	}

}
