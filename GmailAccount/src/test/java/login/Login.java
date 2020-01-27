package login;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	public WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/saravmalar/SeleniumSoftwares/chromedriver");
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/#");
		
	}
	
	@Test
	public void login() throws IOException
	{
		
		Actions action = new Actions(driver);
		driver.findElement(By.linkText("Sign in")).click();
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("abc@gmail.com");;
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("/Users/saravmalar/Documents/GmailError.png"));
		
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
