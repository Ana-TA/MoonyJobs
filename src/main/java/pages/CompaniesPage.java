package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CompaniesPage extends SeleniumWrappers{

	public CompaniesPage(WebDriver driver) {
		super(driver);
	}
	
	public By searchField = By.xpath("//input[@class='company-search-control archive-search-control ui-autocomplete-input']");
	public By searchButton =  By.xpath("//button[@class='btn-top-filter civi-button']");
	public By companyNameResult = By.xpath("//main[@class='site-main']//h2[@class='company-title']");
	
}
