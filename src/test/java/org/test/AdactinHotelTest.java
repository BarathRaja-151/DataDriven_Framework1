package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseClass;

public class AdactinHotelTest extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		
		AdactinHotelTest.browserLaunch("Chrome");
		
		AdactinHotelTest.getUrl("https://adactinhotelapp.com/index.php");
		
		String username = AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx","Login", 1, 0);
		
		String password = AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx","Login", 1, 1);
		
		AdactinHotelTest.getLoginCredentials("username", "password");
		
		AdactinHotelTest.clickloginButton();
		
		String location = AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "search a hotel", 0, 0);
		
		WebElement locationdropdown = driver.findElement(By.id("location"));
		
		AdactinHotelTest.dropdown(locationdropdown, "text", location);
		
	    String hotel= AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "search a hotel", 0, 1);
	
        WebElement hoteldropdown = driver.findElement(By.id("hotels"));
        
        AdactinHotelTest.dropdown(hoteldropdown,"text", hotel);
        
		String selectroomtype = AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx","search a hotel", 0, 2);
		
		WebElement selectroomtypedropdown = driver.findElement(By.id("room_type"));
		
		AdactinHotelTest.dropdown(selectroomtypedropdown, "text", selectroomtype);
		
		String noofrooms = AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "search a hotel", 0, 3);
       
		WebElement roomsdropdown= driver.findElement(By.id("room_nos"));
        
        AdactinHotelTest.dropdown(roomsdropdown, "text", noofrooms);
        
        String adultsperroom = AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "search a hotel", 0, 6);
       
        WebElement adultsperroomdropdown = driver.findElement(By.id("adult_room"));
        
        AdactinHotelTest.dropdown(adultsperroomdropdown, "text", adultsperroom);
        
        
       String childperroom= AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "search a hotel", 0, 7);
		
        WebElement childperroomdropdown = driver.findElement(By.id("child_room"));
        
        AdactinHotelTest.dropdown(childperroomdropdown, "text", childperroom);
        
        AdactinHotelTest.searchButton();
        
        AdactinHotelTest.radiobuttonclick();
        
        AdactinHotelTest.clickcontinueButton();
        
        String firstname = AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "book a hotel", 0, 0);
        
        String lastname = AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "book a hotel", 0, 1);
        
        String address = AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "book a hotel", 0, 2);
        
        String creditcardno = AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "book a hotel", 0, 3);
        
        AdactinHotelTest.getuserCredentials("firstname", "lastname", "address", "creditcardno");
        
        String selectcreditcard = AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "book a hotel", 0, 4);
        
        WebElement creditcarddropdown= driver.findElement(By.id("cc_type"));
        
        AdactinHotelTest.dropdown(creditcarddropdown, "text", selectcreditcard);
        
        String selectcreditcardmonth = AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "book a hotel", 0, 5);
        
        WebElement creditcardmonthdropdown= driver.findElement(By.id("cc_exp_month"));
        
        AdactinHotelTest.dropdown(creditcardmonthdropdown, "text", selectcreditcardmonth);
        
        String selectcreditcardyear = AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "book a hotel", 0, 6);
        
        WebElement creditcardyeardropdown  = driver.findElement(By.id("cc_exp_year"));
        
        AdactinHotelTest.dropdown(creditcardyeardropdown, "text", selectcreditcardyear);
        
        String creditcardcvv= AdactinHotelTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "book a hotel", 0, 7);
        
        AdactinHotelTest.getcreditcardcvvdetails("creditcardcvv");
        
        AdactinHotelTest.clickbooknowButton();
        
        
		}

	}

		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
