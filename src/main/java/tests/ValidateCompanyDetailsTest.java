package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ValidateCompanyDetailsTest extends BaseTest{
	
	@Test(priority=1)
	public void validateCompanyDetails() {
		app.click(app.menu.companiesLik);
		app.sendKeys(app.companies.searchField, "Coin");
		app.click(app.companies.searchButton);
		app.click(app.companies.companyNameResult);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByClassName('civi-button button-outline-accent btn-login')[0].click()");
		assertTrue(app.elementIsDisplayed(app.company.followLogInPopUp));
		app.click(app.company.closePopup);
		
		app.click(app.company.visitWebButton);
		List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		String currentUrl = driver.getCurrentUrl();
		assertEquals(currentUrl, "https://www.cointracker.io/");
		driver.close();
		driver.switchTo().window(browserTabs.get(0));
		assertEquals(driver.getCurrentUrl(), "https://moony.ro/companies/b2b-saas/cointracker/");
		
		jse.executeScript("document.getElementsByClassName('civi-button btn-login')[0].click()");
		assertTrue(app.elementIsDisplayed(app.company.followLogInPopUp));
		app.click(app.company.closePopup);
		
		WebElement categElement = driver.findElement(app.company.categoryText);
		assertEquals(categElement.getText(), "B2B SaaS Web Development");
		WebElement sizeElement = driver.findElement(app.company.sizeText);
		assertEquals(sizeElement.getText(), "200-300");
		WebElement foundedElement = driver.findElement(app.company.foundedIn);
		assertEquals(foundedElement.getText(), "2017");
		WebElement locationElement = driver.findElement(app.company.location);
		assertEquals(locationElement.getText(), "San Francisco");
		
	}

}
