package GradleDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridExecution {
	WebDriver driver;
	String baseUrl,nodeUrl;
	@BeforeTest
	public void setUp() throws MalformedURLException
	{
		baseUrl="https://facebook.com";
		nodeUrl="http://192.168.103.34:4444/";
		DesiredCapabilities des= DesiredCapabilities.chrome();
		des.setBrowserName(baseUrl);
		des.setPlatform(Platform.MAC);
		driver = new RemoteWebDriver(new URL(nodeUrl), des);
		
		
	}
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
	@Test
	public void test()
	{
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("Title of the Webpage"+title);
	}

}
