package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.BaseClass;
import com.pages.LoginPage;
import com.utilities.PropertiesUtils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends BaseClass {

	LoginPage lp= null;
	@Before// hooks in cucumber-- it will run before every scenario
	public void setup() {
		initialization();
		lp = new LoginPage(driver);
	}
	
	@After// it will after every scenario
	public void tearDown() {
		//driver.close();
	}
	
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		driver.manage().window().maximize();
		driver.get(PropertiesUtils.readproperty("url"));
	}

	@When("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
	    lp.loginToApplication();
	}

	@Then("^user should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
		Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	}
	@Then("^user should see logo on the page$")
	public void user_should_see_logo_on_the_page() throws Throwable {
		Assert.assertTrue(lp.verifyLogo());
	}
}

