package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/saravmalar/SeleniumSoftwares/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Dropdown using select
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByIndex(10);;
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jun");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1999");

	}

}
