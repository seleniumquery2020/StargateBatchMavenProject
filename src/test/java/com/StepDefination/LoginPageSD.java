package com.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSD {

	WebDriver driver;
	LoginPage loginPage;
	WebDriverWait wait;

	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\CountersignTechnology\\StargateMavenProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
		wait = new WebDriverWait(driver, 20);
	}

	@When("User open the application url")
	public void user_open_the_application_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Then("Verify that user landed on Login Page")
	public void verify_that_user_landed_on_Login_Page() {

		wait.until(ExpectedConditions.visibilityOfAllElements(loginPage.loginTitle));
		System.out.println("Page Title = " + loginPage.loginTitle.getText());

	}

	@Then("Verify the title of login page")
	public void verify_the_title_of_login_page() {

		String title = driver.getTitle();
		System.out.println("Page Title = " + title);
	}

	@Then("Verify the comapny logo is present on Login page")
	public void verify_the_comapny_logo_is_present_on_Login_page() {
		boolean res = false;
		wait.until(ExpectedConditions.visibilityOfAllElements(loginPage.companyLogo));
		try {
			res = loginPage.companyLogo.isDisplayed();
		} catch (RuntimeException e) {
			res = false;
		}

		System.out.println("result = " + res);

		if (!res) {
			Assert.fail("The comapny logo is not present on Login page");
		}

	}
}
