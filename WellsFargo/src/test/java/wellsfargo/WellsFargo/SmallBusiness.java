package wellsfargo.WellsFargo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmallBusiness {
	
	public WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/saravmalar/SeleniumSoftwares/chromedriver");
		
		driver=new ChromeDriver();
		driver.get("https://www.wellsfargo.com/");
		
	}
	@Test
	public void smallBusiness()
	{
		driver.findElement(By.xpath("//*[@id=\"tabNavSmallBusiness\"]")).click();
		WebElement web=driver.findElement(By.xpath("//*[@id=\"destination\"]"));
		web.click();
		
		Select select = new Select(web);
		select.selectByIndex(1);
		
	}
	}
