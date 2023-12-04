package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers{

	public MenuPage(WebDriver driver) {
		super(driver);
	}
	
	public By companiesLik = By.linkText("Companies");
	public By loginButton = By.linkText("Login");
	public By findJobsLink = By.linkText("Find jobs");

}
