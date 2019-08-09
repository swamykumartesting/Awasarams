package HMSOUTPUT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Fantasis {
	public WebDriver driver;
	public String str;
 
  
  
  @Test
  public void functionality() throws Exception{
	  
//Read the data from the input file	  
FileInputStream fi = new FileInputStream("C:\\Users\\mswamy\\Desktop\\login.xls");
	  Workbook w = Workbook.getWorkbook(fi);
	  Sheet s = w.getSheet("kk");


//Create the result file under the result folder	  
FileOutputStream fo = new FileOutputStream("C:\\Users\\mswamy\\Downloads\\Latest SeleniumWorkspace 2025\\04 TEST__NG__Real__Time__Concepts 20\\16 DataDriven_Perfect Iosteams 2019\\omy\\seleniumResult.xls");
	  WritableWorkbook wb = Workbook.createWorkbook(fo);
	  WritableSheet ws=wb.createSheet("Results", 0);
for (int i = 1; i < s.getRows(); i++) {



//Enter username,Password and click on signin by taking data from input file
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(3000);
driver.findElement(By.id("UserName")).sendKeys(s.getCell(0, i).getContents());
Thread.sleep(3000);
driver.findElement(By.id("Password")).sendKeys(s.getCell(1, i).getContents());
Thread.sleep(3000);

driver.findElement(By.xpath("html/body/div[2]/div/section/form/div/div[2]/div[4]/div[2]/input")).click();
Thread.sleep(5000);

//Validate singout, if available assign pass to str, else assign fail to str

try{
	//driver.findElement(By.linkText("Log out")).click();	
	
	driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/div[1]/form/a")).click();
	Thread.sleep(6000);
	str="Pass";
}catch(Exception e){str="Fail";


}
//Add str value to the result file under result column
jxl.write.Label result = new jxl.write.Label(2, i, str);
ws.addCell(result);


//Add input data to the result file
for (int j = 0; j < s.getColumns(); j++) {
	
	System.out.println(s.getCell(j, i).getContents());
	jxl.write.Label l = new jxl.write.Label(j, i, s.getCell(j, i).getContents());
	ws.addCell(l);
	
	
}
	
}
//Add the heading

jxl.write.Label un=new jxl.write.Label(0,0,"Username");
jxl.write.Label pw=new jxl.write.Label(1,0,"Password");
jxl.write.Label rs = new jxl.write.Label(2, 0, "Results");
	ws.addCell(un);
	ws.addCell(pw);
	ws.addCell(rs);

	//Write and close the result file	
		wb.write();
		wb.close();

  }

  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "H:\\lib\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.computechis.com/DemoSite/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
  }

  @AfterTest
  public void afterTest() {
  }

}
