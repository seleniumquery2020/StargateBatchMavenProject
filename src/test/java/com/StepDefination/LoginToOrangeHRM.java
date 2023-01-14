package com.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;
import com.utilities.AutomationUtils;

public class LoginToOrangeHRM {
	
	@Test
	public static void main( ){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\CountersignTechnology\\StargateMavenProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		LoginPage loginPage = new LoginPage(driver);
		AutomationUtils.driver = driver;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean result = loginPage.verifyLogoIsPresent();		
		Assert.assertEquals(result,true);
		
		loginPage.enterUsername("Admin");
		
		loginPage.enterPassword("admin123");
		
		loginPage.clicksOnLoginButton();
	}

}
