package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class JobsPage extends SeleniumWrappers{

	public JobsPage(WebDriver driver) {
		super(driver);
	}
	
	public By searchJobField = By.id("jobs_filter_search");
	public By searchButton = By.xpath("//button[@class='btn-top-filter civi-button']");
	public By testEngineerKeyTest = By.xpath("//h3[@class='jobs-title']/a[@href='https://moony.ro/jobs/analytics/test-engineer-at-keytest/']");

}
