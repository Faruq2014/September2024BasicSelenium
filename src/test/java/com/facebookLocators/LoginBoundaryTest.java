package com.facebookLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginBoundaryTest {
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
	public void validLoginTest() {
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("jkl@ymail.com");
		WebElement passButton = driver.findElement(By.name("pass"));
		passButton.sendKeys("hjjh");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
	}
	@Test
	public void inValidLoginTest() {

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("wrongUserName");
		WebElement passButton = driver.findElement(By.name("pass"));
		passButton.sendKeys("wrongPass");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
	
	}
	@Test
	public void inValidUserNameTest() {

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("wrongUserName");
		WebElement passButton = driver.findElement(By.name("pass"));
		passButton.sendKeys("kjkkl");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
	
	}
	@Test
	public void inValidPaswordTest() {

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("jkl@ymail.com");
		WebElement passButton = driver.findElement(By.name("pass"));
		passButton.sendKeys("wrongPass");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
	
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}

}
