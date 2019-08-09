package BestofBest2019;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Savaari_oneway_Validation {
	
	
	public WebDriver driver;
	
  @Test
  public void validation() {
	  
	  driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[2]")).click();
	  
	  if (driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/form/div[3]/div[3]/label")).isDisplayed()) {
		
		  System.out.println("Not A Bug");
	} else {
		
		System.out.println("BUG");

	}
	  
	  
	  
  }
  
  @BeforeTest
	public void beforeTest() throws Exception {
	  
System.setProperty("webdriver.chrome.driver", "H:\\lib\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.savaari.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();



	}

	@AfterTest
	public void afterTest() {
		
	}

}


