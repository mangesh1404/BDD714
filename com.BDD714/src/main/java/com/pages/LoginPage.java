package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginBtn;
	
	@FindBy(xpath="//img")
	WebElement logo;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApplication() {
		
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginBtn.click();
	}
	
	public void testLogin(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public boolean verifyLogo() {
		
		return logo.isDisplayed();
	}
}
