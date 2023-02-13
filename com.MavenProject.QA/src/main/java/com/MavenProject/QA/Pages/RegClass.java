package com.MavenProject.QA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class RegClass extends browserSetup {
	
	@FindBy(xpath="//img[@alt='Facebook']")private WebElement fblogo;
	@FindBy(xpath="//input[@name='firstname']")private WebElement firstname;
	@FindBy(xpath="//input[@name='lastname']")private WebElement lastname;
	@FindBy(xpath="//input[@name='reg_email__']")private WebElement email;
	@FindBy(xpath="//input[@name='reg_passwd__']")private WebElement password;
	@FindBy(xpath="//input[@value='1']")private WebElement gender;
	@FindBy(xpath="//button[@name='websubmit']")private WebElement login;
	
	public RegClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyFbLogo() {
		Assert.assertTrue(fblogo.isDisplayed(), "not displayed");
		Reporter.log("VerifyFbLogo", true);
	}
	
	public void SetFirstName() {
		Assert.assertTrue(firstname.isDisplayed(), "not displayed");
		firstname.sendKeys("supriya");
		Reporter.log("SetFirstName", true);
	}
	
	public void SetLastName() {
		Assert.assertTrue(lastname.isDisplayed(), "not displayed");
		lastname.sendKeys("kokane");
		Reporter.log("SetLastName", true);
	}
	
	public void SetEmailId() {
		Assert.assertTrue(email.isDisplayed(), "not displayed");
		email.sendKeys("sk123@gmail.com");
		Reporter.log("SetEmailId", true);
	}
	
	public void SetPassword() {
		Assert.assertTrue(password.isDisplayed(), "not displayed");
		password.sendKeys("sk123");
		Reporter.log("SetPassword", true);
	}
	
	public void SetGender() {
		Assert.assertTrue(gender.isEnabled(), "not enabled");
		gender.click();
		Reporter.log("SetGender", true);
	}
	
	public void ClickSignUp() {
		Assert.assertTrue(login.isEnabled(), "not enabled");
		login.click();
		Reporter.log("ClickSignUp", true);
	}

}
