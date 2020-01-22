package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandling {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/saravmalar/SeleniumSoftwares/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wellsfargo.com/");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//driver.findElement(By.xpath("//*[@id=\"custom-search-input\"]/div/div/div/div/input")).sendKeys("abc");
//		
//		WebElement a =driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[2]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a"));
//		WebElement b = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[2]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[2]/ul/li[2]/a/span"));
		
		WebElement a = driver.findElement(By.xpath("//a[@id='bankingTab']"));
		Actions action = new Actions(driver);
		action.moveToElement(a).click().build().perform();;
		driver.close();
		
		
	
	}

}
