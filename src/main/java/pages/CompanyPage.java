package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CompanyPage extends SeleniumWrappers{

	public CompanyPage(WebDriver driver) {
		super(driver);
	}
	
	public By followButton = By.xpath("//a[@class='civi-button button-outline-accent btn-login']");
	public By visitWebButton = By.xpath("//a[@class='civi-button button-outline btn-webs button-icon-right']");
	public By sendMsgButton = By.xpath("//a[@class='civi-button btn-login']");
	
	public By followLogInPopUp = By.xpath("//div[@class='head-popup']");
	public By closePopup = By.xpath("(//a[@href='#' and @class='btn-close'])[3]");
	
	public By categoryText = By.xpath("(//div[@class='list-cate'])[1]");
	public By sizeText = By.xpath("(//div[@class='list-cate'])[2]");
	public By foundedIn = By.xpath("(//p[@class='details-info'])[1]");
	public By location = By.xpath("(//p[@class='details-info'])[2]");

}
