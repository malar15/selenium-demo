package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrapperMethods {

	
		// TODO Auto-generated method stub
		WebDriver driver;
		public void insertapp(String url)
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		public void enterbyid(String val,String name)
		{
			
		}
		

	

}
