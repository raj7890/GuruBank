package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import genericfunctions.GenericFunctions;
import globalvariables.appglobalvariables;
import objectrepository.HomePage;

public class setup {
		
	appglobalvariables objglobalvar = new appglobalvariables();
	public WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void browsersetup(String browser)
	{
		try {
				if(browser.equals("Firefox")){
					driver = new FirefoxDriver();
					driver.get("http://www.demo.guru99.com/v4/index.php");
				}else if(browser.equals("chrome")){
					System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.get("http://demo.guru99.com/v4/index.php");
				}else if(browser.equalsIgnoreCase("IE")){
					System.setProperty("webdriver.driver.IE", "C:\\Selenium\\chromedriver.exe");
				}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void fnLaunch()
	{
		driver.get("http://demo.guru99.com/v4/index.php");
	}
	
	@AfterTest
	public void fnCloseBrowsers()
	{
		driver.close();
	}

}
