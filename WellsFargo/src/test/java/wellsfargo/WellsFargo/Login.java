package wellsfargo.WellsFargo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	public WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/saravmalar/SeleniumSoftwares/chromedriver");
		
		driver=new ChromeDriver();
		driver.get("https://www.wellsfargo.com/");
		
	}
	@Test
	public void checkTitle()
	{
		String title= driver.getTitle();
		Assert.assertEquals(title, "Wells Fargo – Banking, Credit Cards, Loans, Mortgages & More");
	}
	@Test
	public void login()
	{
		driver.findElement(By.id("userid")).sendKeys("abc@mail.com");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='btnSignon']")).click();
	}
	
	
    @AfterMethod
    public void close()
    {
    	driver.close();
    }
}
