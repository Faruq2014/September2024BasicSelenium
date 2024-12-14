package com.facebookLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	public WebDriver driver; // instance variable -- Selenium syntax

	// TestNG presentation
	@BeforeTest
	// java method declaration
	public void openApp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(priority = 0)
	public void userNameTest() {
		// WebElement userName=driver.findElement(By.id("email"));
		// userName.sendKeys("jkl@ymail.com");
		// driver.findElement(By.id("email"));

		driver.findElement(By.id("email")).sendKeys("klk@hmail.com");

	}

	@Test(priority = 1)
	public void passwordTest() {
		WebElement passButton = driver.findElement(By.name("pass"));
		passButton.sendKeys("hjjh");
		passButton.clear();
		passButton.sendKeys("dddd");
		System.out.println(passButton.getAttribute("id"));

	}

	@Test(priority = 2)
	public void loginButtonTest() {
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
	}

	@AfterTest
	public void closeApp() {
		// driver.quit();
	}
}
