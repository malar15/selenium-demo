package library;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WrapperClass {
	public WebDriver driver;

	public void launchApplication(String browser, String url) {
		try {
		if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "/Users/saravmalar/SeleniumSoftwares/geckodriver");
			
		}
		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/saravmalar/SeleniumSoftwares/chromedriver");
			driver = new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
		}catch(WebDriverException e)
		{
			System.out.println("Browser could not be launched");
		}
	}
	
	public void screenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot scr = (TakesScreenshot) driver;
		File source = scr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("/Users/saravmalar/Documents/error/error.png"));
	}
	
	public void quit()
	{
		driver.close();
	}
}
