package com.facebookLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HowToOpenLinkPage {

	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void openMessangerPageTest() {
	 WebElement  messangerLink =driver.findElement(By.linkText("Messenger"));
	 messangerLink.click();
	}
	
	@Test
	public void openGamePageTest() {
	 WebElement  gameLink =driver.findElement(By.linkText("Games"));
	 gameLink.click();
	}
	
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
	
}
