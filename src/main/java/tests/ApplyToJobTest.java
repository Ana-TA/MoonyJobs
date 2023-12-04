package tests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ApplyToJobTest extends BaseTest{

	@Parameters({"user", "pass"})
	@Test(priority=1)
	public void stepIntoMyAccount(String user, String pass) throws IOException {
		
		app.click(app.menu.loginButton);
		app.myAccount.loginInApp(user, pass);
		assertTrue(app.elementIsDisplayed(app.myAccount.welcomeLoginMsg));
		
		app.click(app.menu.findJobsLink);
		app.sendKeys(app.jobs.searchJobField, "Test Engineer");
		app.click(app.jobs.searchButton);
		app.scrollVertically(100);
		app.click(app.jobs.testEngineerKeyTest);
		
		assertTrue(app.elementIsDisplayed(app.singleJob.applyNowButton));
		assertTrue(app.elementIsDisplayed(app.singleJob.aboutCompanyMsg));
		
		app.click(app.singleJob.applyNowButton);
		assertTrue(app.elementIsDisplayed(app.singleJob.callEmployerPopup));
		
		app.click(app.singleJob.callIcon);
	}
	
	
}
