package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class SingleJobPage extends SeleniumWrappers{

	public SingleJobPage(WebDriver driver) {
		super(driver);
	}
	
	public By applyNowButton = By.xpath("(//a[@class='civi-button civi-button-apply civi_form_apply_jobs_6351'])[2]");
	public By aboutCompanyMsg = By.id("tab-sidebar-overview");
	public By callEmployerPopup = By.xpath("//div[@class='apply-popup']");
	public By callIcon = By.xpath("//i[@class='fal fa-phone-alt']"); 

}
