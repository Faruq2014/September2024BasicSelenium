package facebookWebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowTogetTitleAndUrl {
	
	WebDriver driver;
	
	/* this is instance variable
	all the method need this variable--> this is the reason to make it instance
	*/
	
	@BeforeTest
	public void openApp() {
		driver= new ChromeDriver(); // opening the browser
		driver.get("https://www.google.com/"); //  open application
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void titleTest() {
	String	expectedTitle=driver.getTitle();
	// Sting == data type
	// expectedTitle == variable name
	System.out.println("The google title is : "+expectedTitle);
	// Actual results= Expected Results == Pass
	String actualTitle= "Google123";
	Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	@Test 
	public void ulrTest() {
	String	expectedUrl=driver.getCurrentUrl();
	System.out.println("Google url is :   "+expectedUrl);
	String actualUrl="https://www.google.com/";
	Assert.assertEquals(actualUrl, expectedUrl);
	
	
		
	}
	
	@AfterTest
    public void closeApp() {
		//driver.close();
		driver.quit();
	}

}
