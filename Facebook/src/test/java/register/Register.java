package register;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Register {
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/saravmalar/SeleniumSoftwares/chromedriver");
		
		driver=new ChromeDriver();
		Properties prop =new Properties();
		FileInputStream objfile  = new FileInputStream("/Users/saravmalar/selenium-workspace/Facebook/config.properties");
		prop.load(objfile);
		driver.get(prop.getProperty("url"));
		
	}
	@Test
	public void register() throws IOException, InterruptedException
	{
		
		FileInputStream file = new FileInputStream(new File("/Users/saravmalar/SeleniumSoftwares/Register.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook (file);
		XSSFSheet sheet= workbook.getSheet("Registersheet");
		int count = sheet.getLastRowNum();
		System.out.println(count);
		
		
		
		for(int i=1; i<=count; i++)
		{
			XSSFRow row= sheet.getRow(i);
			XSSFCell cell= row.getCell(0);
			String firstName =cell.getStringCellValue();
			XSSFCell cell1= row.getCell(1);
			String lastName = cell.getStringCellValue();
			
			System.out.println(count);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://facebook.com");
			driver.findElement(By.xpath("//*[@id=\"u_0_s\"]")).sendKeys(firstName);	
			driver.findElement(By.id("u_0_u")).sendKeys(lastName);
			Thread.sleep(3000);
			driver.close();

		}
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
