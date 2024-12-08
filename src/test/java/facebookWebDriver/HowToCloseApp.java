package facebookWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowToCloseApp {
	
	WebDriver driver;
	
	@BeforeTest
	public void openApp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void loginTest() {
		System.out.println("no test yet");
	}
	
	
	@AfterTest
	public void closeApp() {
		//ChromeDriver driver = new ChromeDriver();
		driver.close();
	}

}
