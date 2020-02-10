package Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification {
	
	WebDriver driver;
	By searchword = By.name("q");
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/saravmalar/SeleniumSoftwares/chromedriver");
		driver=new ChromeDriver();
	}
	public void setUrl() throws InterruptedException
	{
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		Thread.sleep(3000);
	}
	public void Search(String st)
	{
		driver.findElement(searchword).sendKeys(st);
		
	}
	public void closeBrowser()
	{
		System.out.println("******Clsoing browser******");driver.close();
	}
}
