package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By username = By.name("email");
	By password = By.id("pass");
	By loginbutton = By.xpath("//*[@id=\"u_0_2\"]");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void loginToApp_username(String userid) {
		driver.findElement(username).sendKeys(userid);
	}
	public void loginToApp_password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void loginToApp_loginButton() {
		driver.findElement(loginbutton).click();
	}

}
