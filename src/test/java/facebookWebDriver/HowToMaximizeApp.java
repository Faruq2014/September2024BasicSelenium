package facebookWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToMaximizeApp {
 @Test
 public void openGoogle() {
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 driver.manage().window().fullscreen();
	 driver.manage().window().minimize();
	 driver.manage().window().maximize();
	
 }
 

}
