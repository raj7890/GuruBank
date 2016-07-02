package bussinessfunctions;

import org.openqa.selenium.WebDriver;

import genericfunctions.GenericFunctions;
import globalvariables.appglobalvariables;
import objectrepository.HomePage;

public class bussinessfunctions {
	
	GenericFunctions objwebActions = new GenericFunctions(); 
	HomePage objobjectProperties = new HomePage();
	appglobalvariables objglobalvar = new appglobalvariables();
	
	public boolean fnApplogin(WebDriver driver,String StrUserName,String StrPassword)
	{
		if (objwebActions.fnsetvalue(driver,objobjectProperties.UserName, StrUserName))
		{
			System.out.println("User Name "+StrUserName +" enter sucessfully");
		}
		if (objwebActions.fnsetvalue(driver, objobjectProperties.Password, StrPassword))
		{
			System.out.println("Password Name "+StrPassword +" enter sucessfully");
		}
		if (objwebActions.fnClickElement(driver, objobjectProperties.Login))
		{
			System.out.println("login clicked sucessfully");
		}	
		return true;
	}
	
}
