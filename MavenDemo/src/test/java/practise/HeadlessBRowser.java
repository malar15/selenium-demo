package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBRowser {
	
	
	public static void main(String[] args)
	{
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.wellsfargo.com/");
		System.out.println("Title of the page is "+driver.getTitle());
		
	}

}
