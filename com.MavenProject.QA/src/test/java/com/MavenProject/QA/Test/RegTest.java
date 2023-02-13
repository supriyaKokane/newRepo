package com.MavenProject.QA.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.MavenProject.QA.Pages.RegClass;
import com.MavenProject.QA.Pages.browserSetup;

public class RegTest extends browserSetup{
	
	@BeforeClass
	public void browserLaunch() {
		browserSetup.setup("chrome");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test
	public void abc() {
		RegClass ob=new RegClass(driver);
		
		ob.VerifyFbLogo();
		ob.SetFirstName();
		ob.SetLastName();
		ob.SetEmailId();
		ob.SetPassword();
		ob.SetGender();
		ob.ClickSignUp();
	}

}
