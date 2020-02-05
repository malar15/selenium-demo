package pagesApp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By login = By.linkText("Login");
	By email = By.xpath("//input[@class='_2zrpKA _1dBPDZ']");
	By pwd = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By button =By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
	By text = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/span[2]/span");
	By newacc=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[5]/a");
	
	By actext=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/span[3]/span");
	By contibutton = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/button");
	///html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/span[3]/span
	
	///html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String login()
	{
		driver.findElement(login);
		driver.switchTo().window(driver.getWindowHandle()).findElement(email).sendKeys("email");;
		driver.findElement(pwd).sendKeys("pass");
		driver.findElement(button).click();
		String text1=driver.findElement(text).getText();
		System.out.println(text1);
		return text1;
		
	}
	public String createAcc()
	{
		driver.findElement(login);
		driver.switchTo().window(driver.getWindowHandle()).findElement(newacc).click();
		driver.findElement(email).sendKeys("1233");
		driver.findElement(contibutton).click();
		String acttext =driver.findElement(actext).getText();
		return acttext;
		
	}

}
