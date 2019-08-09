package TestNGPrograms;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

public class Currencyvalidation {
	
	public WebDriver driver;
	
  @Test
  public void functionality() {
	  
	  WebElement str = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getFirstSelectedOption();
		System.out.println(str.getText());
		if(str.getText().equalsIgnoreCase("IN"))
		{
			
			System.out.println("dropdown validation passed = INR");
			
			
		}else{
		
			System.out.println("dropdown validation failed");
		}
		}
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "H:\\lib\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://spicejet.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
