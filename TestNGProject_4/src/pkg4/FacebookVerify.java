package pkg4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookVerify {
	
	
	public WebDriver driver; 
	@BeforeTest
	public void launchBrowser(){
		System.setProperty("webdriver.chromedriver", ".\\chromedriver.exe");
		driver= new ChromeDriver();
	
	
	driver.get("http://www.facebook.com");
	}
	@Test
	public void verifyHomePageTitle()
	{
	String expectedTitle = "Welcome to Facebook- Log In, Sign Up or Learn More";
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	Assert.assertEquals(actualTitle,expectedTitle);
	}
	@AfterTest
	public void terminateBrowser()
	{
	driver.quit();
	}
	}
