package Traget2020sri;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class proassert {

	public static void main(String[] args) {
	
		WebDriver driver;
		 
		 System.setProperty("webdriver.chrome.driver", "H:\\lib\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
		  driver.get("https://www.google.com");
			
		  String expectedText = "Google";
		  
			Assert.assertEquals(expectedText, driver.getTitle(), "Passed");

		  
		  
		  }
		 
		  

	}


	

