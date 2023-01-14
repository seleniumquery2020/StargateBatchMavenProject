package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//img[@alt='company-branding']")
	public WebElement companyLogo;
	
	@FindBy(name = "username")
	public WebElement usernameInputFld;
	
	@FindBy(name = "password")
	public WebElement passwordInputFld;
	
	@FindBy(tagName = "button")
	public WebElement loginBtn;
	
	@FindBy(css = "h5[class*='login-title']")
	public WebElement loginTitle;
	
	
	public boolean verifyLogoIsPresent() {
		boolean res = false;
		try {
			res = companyLogo.isDisplayed();
		}catch (RuntimeException e) {
			res=false;
		}
		 return res;
	}
	
	
	public void enterUsername(String username) {
		usernameInputFld.sendKeys(username);
	}
	
	
	public void enterPassword(String password) {
		passwordInputFld.sendKeys(password);
	}
	
	
	public void clicksOnLoginButton() {
	    loginBtn.click();
	}
	
	public LoginPage(WebDriver driver){
		
		PageFactory.initElements(driver,this);
		
	}
}
