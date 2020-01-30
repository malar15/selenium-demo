package practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ObjectRepository {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/saravmalar/SeleniumSoftwares/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Properties obj = new Properties();
		FileInputStream objfile  = new FileInputStream("/Users/saravmalar/selenium-workspace/MavenDemo/config.property");
		obj.load(objfile);
		
		driver.findElement(By.id(obj.getProperty("username"))).sendKeys("abc");
		driver.findElement(By.id(obj.getProperty("password"))).sendKeys("abc");
		driver.findElement(By.id(obj.getProperty("submit"))).click();;
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("/Users/saravmalar/selenium-workspace/MavenDemo/Loginerror.png"));
		String text =driver.findElement(By.xpath("//*[@id=\"error_box\"]/div[1]")).getText();
		System.out.println(text);
		//driver.close();

	}

}
