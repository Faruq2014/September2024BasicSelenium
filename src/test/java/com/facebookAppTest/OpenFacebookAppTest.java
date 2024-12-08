package com.facebookAppTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OpenFacebookAppTest {
	
	@Test
	public void howToOpenAppWithChrome() {
		// how to open chrome browser ?
		
		ChromeDriver driver = new ChromeDriver();
		
		//how to open Application ?
		
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void howToOpenAppWithEdge() {
		
		// how to open edge browser ?
		EdgeDriver driver = new EdgeDriver();
		//how to open Application ?
		driver.get("https://www.google.com/");
		
	}

}
