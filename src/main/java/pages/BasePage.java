package pages;

import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BasePage extends SeleniumWrappers{

	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	public MenuPage menu = new MenuPage(driver);
	public CompaniesPage companies = new CompaniesPage(driver);
	public CompanyPage company = new CompanyPage(driver);
	public MyAccountPage myAccount = new MyAccountPage(driver);
	public JobsPage jobs = new JobsPage(driver);
	public SingleJobPage singleJob = new SingleJobPage(driver);

}
