package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.sql.BatchUpdateException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SavariOnewayvalidation {
	
	public WebDriver driver;
	
	  
		@Test
		  public void test () throws IOException, InterruptedException 
		  {
			
		//Printing the boolean condition where its true/false
		boolean Printcondition = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/form/div[3]/div[3]/div/p-calendar[1]/span/input")).isDisplayed();
			  System.out.print(Printcondition);
		  
			
	WebElement roundtripbutton = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/form/div[3]/div[3]/div/p-calendar[1]/span/input"));
	  
	  
	
	  
	  if(roundtripbutton.isEnabled())
	  {
	   System.out.print("\n Its Displayed");
	  }
	  else
	  {
	   System.out.print("\n Its Not Displayed");
	  }
	  
	  
  }
	 
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "H:\\lib\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://savaari.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
