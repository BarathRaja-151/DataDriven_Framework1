package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.invoke.MethodType;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")){
			
			 driver = new ChromeDriver();
			}
		
		else if(browser.equalsIgnoreCase("Edge")) {
			
			 driver = new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			
			 driver = new FirefoxDriver();
			
		}
		
		return driver;
	}
		
		
	public static void getUrl(String url) {
		
		driver.get(url);
		
	}
	
	public static String excelReader(String path,String sheetname,int rownum,int cellnum) throws IOException {
		
		File f = new File(path);
		

		FileInputStream stream = new FileInputStream(f); 
		
		Workbook wb = new XSSFWorkbook(stream);
		
		Sheet sheet = wb.getSheet(sheetname);
		
		Row row = sheet.getRow(rownum);
		
    	Cell cell = row.getCell(cellnum);
    	
	    DataFormatter formatter = new DataFormatter();
	    String data = formatter.formatCellValue(cell);
//		
	    return data;
		
	}
	
	public static WebDriver getLoginCredentials (String username,String password) {
		
		 driver.findElement(By.name(username)).sendKeys("reshmi1234");
		 driver.findElement(By.name(password)).sendKeys("Oranium");
		 
		 return driver;
		
		}
	
	public static WebDriver getuserCredentials(String firstname,String lastname,String billingaddress,Object input) {
		
		driver.findElement(By.id("first_name")).sendKeys("Barath");
		driver.findElement(By.id("last_name")).sendKeys("Raja");
		driver.findElement(By.id("address")).sendKeys("no: 96,6th cross street natesan nagar velrampet pondicherry");	
		driver.findElement(By.id("cc_num")).sendKeys("1213141516171810");
		
		return driver;
		
	}
	
	public static WebDriver getcreditcardcvvdetails(Object input) {
		
		driver.findElement(By.id("cc_cvv")).sendKeys("389");
		return driver;
		
		
	}
	
	
	
	
	
	public static WebDriver clickloginButton() {
		
		WebElement loginbutton = driver.findElement(By.id("login"));
		loginbutton.click();
		
		return driver;
		
		}
	
	
	public static WebDriver checkin (String checkindate) {
		
		 driver.findElement(By.name(checkindate)).sendKeys("17-02-2025");
		
		 
		 return driver;
	  }
	
	public static WebDriver adults (String adultsPerroom) {
		
		 driver.findElement(By.name(adultsPerroom)).sendKeys("3 -Three");
		
		 
		 return driver;
}
	public static WebDriver child (String childPerroom) {
		
		 driver.findElement(By.name(childPerroom)).sendKeys("4 - Four");
		
		 return driver;
	
	
}
    public static WebDriver searchButton() {
		
		driver.findElement(By.id("Submit")).click();
		
		return driver;
}
    public static WebDriver clickcontinueButton() {
		
		driver.findElement(By.id("continue")).click();
		
		return driver;
}
    public static WebDriver clickbooknowButton() {
		
		driver.findElement(By.id("book_now")).click();
		
		return driver;
}
    
    public static WebDriver radiobuttonclick() {
    	driver.findElement(By.id("radiobutton_0")).click();
    	return driver;
    }
    
   public static void closeBrowser() {
    driver.close(); 
    
}
   
  public static void dropdown(WebElement element, String locmethodType, Object input) {
	  
	  Select s = new Select(element);
	  
	  if(locmethodType.equalsIgnoreCase("index")) {
		  s.selectByIndex((int) input);
	  }
		  
		  else if(locmethodType.equalsIgnoreCase("text")) {
			  s.selectByVisibleText((String) input);
			  
		  }
	  
		  else if(locmethodType.equalsIgnoreCase("value")) {
			  s.selectByValue((String) input);
			  
		  }
		  
	  }
	  
  }

 
