package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends LoginPage {

	@BeforeMethod
	public void setUp() {
		initialization();
		// authentication();

		// Here we can add the authentification method
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {

//		String title = loginPage.validateLoginPageTile();
//		Assert.assertEquals(title, "Google");
		// Use AssertEquals Assert.assertEquals(title, "Google", "Title not mached");
	}

//	@Test(priority = 2)
//	public void crmLogoImageTest() {
//		boolean flag = loginPage.validateCRMImage();
//		Assert.assertTrue(flag);
//	}
//
//	@Test(priority = 3)
//	public void loginTest() {
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
