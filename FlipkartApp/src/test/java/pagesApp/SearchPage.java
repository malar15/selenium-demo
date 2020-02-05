package pagesApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchPage {
	
	WebDriver driver;
	By login = By.linkText("Login");
	By search =By.xpath("//input[@placeholder='Search for products, brands and more']");
	By results =By.xpath("//span[@class='_2yAnYN']");
	By home =By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/div[1]/a");
	public SearchPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public String search()
	{
		//driver.navigate().back();
		WebElement ele=driver.findElement(search);
		
		ele.sendKeys("shoe");
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);
		System.out.println(ele.isDisplayed());
		String win=driver.getCurrentUrl();
		driver.navigate().to(win);
		String res=driver.findElement(results).getText();;
		System.out.println(res);
		driver.navigate().back();
		return res;
		
	}
	

}
