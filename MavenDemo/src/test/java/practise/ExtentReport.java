package practise;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ExtentReport {
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void startReport()
	{
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/myOwnreport.html",true);
		extent.addSystemInfo("HostName","franklin")
		.addSystemInfo("Environment","Prodouction environment")
		.addSystemInfo("User Name","franklin");
		extent.loadConfig(new File(System.getProperty("user.dir")+"/extent.config"));
	}
	@Test
	public void demoReportPass()
	{
		
	System.setProperty("webdriver.chrome.driver", "/Users/saravmalar/SeleniumSoftwares/chromedriver");
			
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	test=extent.startTest("demoReportPass");
	
	Assert.assertTrue(true);
	test.log(LogStatus.PASS,"Assert pass as condition is True");
	
	}
	@Test
	public void demoReportfail()
	{
	test = extent.startTest("demoReportFail");
	Assert.assertTrue(false);
	test.log(LogStatus.FAIL,"Assert fail as condition is false");
	}
	@AfterMethod
	public void getResult(ITestResult result)
	{
		System.out.println("status"+result.getStatus());
	if(result.getStatus()==ITestResult.FAILURE)
	{
	test.log(LogStatus.FAIL,result.getThrowable());
	}
	extent.endTest(test);
	}
	@AfterTest
	public void endReport()
	{
	extent.flush();
	extent.close();
	}

}
