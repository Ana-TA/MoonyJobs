package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class MyAccountPage extends SeleniumWrappers{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	
	public By userField = By.id("ip_email");
	public By passField = By.id("ip_password");
	public By signInButton = By.xpath("(//button[@class='gl-button btn button'])[1]");
	
	public By welcomeLoginMsg = By.xpath("//h2[@class='entry-title']");
	
	public void loginInApp(String user, String pass) {
		
		sendKeys(userField, user);
		sendKeys(passField, pass);
		click(signInButton);
	}
}
