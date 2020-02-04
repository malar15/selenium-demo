package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
//methods for all the fields
	
	WebDriver driver;
	By firstname = By.id("u_0_m");
	By lastname = By.id("u_0_o");
	By mobileoremail = By.id("u_0_r");
	By newpwd = By.id("u_0_w");
	By month =By.xpath("//*[@id=\"month\"]");
	By dates= By.xpath("//*[@id=\"day\"]");
	By year = By.cssSelector("#year");
	By radio=By.className("_8esa");
	By signup = By.xpath("//*[@id=\"u_0_13\"]");
	By validphoneError = By.xpath("//*[@id=\"u_0_q\"]/i[1]");
	
		public RegisterPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
			this.driver=driver2;
	}
		public void registerFirstname(String fname)
	{
		
		System.out.println(firstname);

		driver.findElement(firstname).sendKeys(fname);
	}
	public void registerLastname(String lname)
	{
		driver.findElement(lastname).sendKeys(lname);
	}
	public void registerMobileorEmail(String email)
	{
		driver.findElement(mobileoremail).sendKeys(email);
		
		
	}
	public void registerNewpwd(String newpass)
	{
		driver.findElement(newpwd).sendKeys(newpass);
	}
	public void registerMonth(String mon)
	{
		
		Select sel =new Select(driver.findElement(month));
		sel.selectByValue(mon);;
	}
	public void registerDate(int date)
	{
		
		Select sel =new Select(driver.findElement(dates));
		sel.selectByIndex(date);;
	}
	public void registerYear(String years)
	{
		
		Select sel =new Select(driver.findElement(year));
		sel.selectByVisibleText(years);
	}
	public void registerFemale()
	{
		
		driver.findElement(radio).click();
	}
	public void registerSignup()
	{
		
		driver.findElement(signup).click();
		driver.switchTo();
		driver.findElement(validphoneError).click();
	}
	
}
