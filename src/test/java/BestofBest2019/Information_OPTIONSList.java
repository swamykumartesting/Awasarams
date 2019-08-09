package BestofBest2019;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Information_OPTIONSList {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  
	  driver.findElement(By.linkText("Registration")).click();
	  
	  //new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByIndex(3);
	  
	 List<WebElement> List = new Select(driver.findElement(By.name("PATIENT_CAT"))).getOptions();
	 
	 System.out.println(List.get(4).getText());
	 
	 for (int i = 0; i < List.size(); i++) {
		 
		 System.out.println(List.get(i).getText());
		 
		 
		
	}
	 
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "H:\\lib\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.computechis.com/DemoSite/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
