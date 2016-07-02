package testscripts;

import org.testng.annotations.Test;

import bussinessfunctions.bussinessfunctions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class verifyHomePageTitle extends setup {
	@Test
	public void fnverifyhomepage()
	{
		bussinessfunctions objAppfunc = new bussinessfunctions();
		objAppfunc.fnApplogin(driver,"mngr41530","hasehuq");
	}
}
