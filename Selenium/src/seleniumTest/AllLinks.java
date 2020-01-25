package seleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/saravmalar/SeleniumSoftwares/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wellsfargo.com/");
		
		//System.out.println(web.getText().toString());
		List<WebElement> a =driver.findElements(By.tagName("a"));
		int count = a.size();
		System.out.println("Count of the links "+count);
		//Actions action = new Actions(driver);
        
		for(int i=0;i<count;i++) {
			
			//WebElement web = driver.findElement(By.tagName("a"));
			//action.moveToElement(web);
			//sSystem.out.println(web.getText());
			String linkName = a.get(i).getText();
			String href = a.get(i).getAttribute("href");
			System.out.println("The link is  "+ linkName+ " - "+href);
			if(href  == null || href.isEmpty())
			{
				//System.out.println("The link name is "+linkName);
				System.out.println("The Link is null or empty");
			}
//			if(!href.contains("https://www.wellsfargo.com/"))
//			{
//				System.out.println("Different Domain");
//			}
			
			
		}
		
		
		driver.close();

	}

}
