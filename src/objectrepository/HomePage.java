package objectrepository;

import org.openqa.selenium.By;

public class HomePage {
	
	// Application home page properties 
	 
	 public By UserName = By.name("uid");
	 public By Password = By.name("password");
	 public By Login = By.name("btnLogin");
	 public By Logout = By.linkText("Log out");
	 
	// Create Customer page properties
	 
	 By CustName = By.name("name");
	 By CustGender = By.name("rad1");
	 By CustDob = By.name("dob");
	 By CustAddress = By.name("addr");
	 By CustCity = By.name("city");
	 By CustState = By.name("state");
	 By CustPin = By.name("pinno");
	 By CustMobileNumber = By.name("telephoneno");
	 By CustEmail = By.name("emailid");
	 By CustPwd = By.name("password");
	 By CustSubmit = By.name("sub");
	 
}
