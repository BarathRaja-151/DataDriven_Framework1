package org.test;

import java.io.IOException;

import org.pom.AdactinHotelLoginPom;
import org.utility.BaseClass;

public class AdactinTest extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		AdactinTest.browserLaunch("chrome");
		AdactinTest.getUrl("https://adactinhotelapp.com/index.php");
		
//-----------------------Login-------------------------------
		
		AdactinHotelLoginPom obj = new AdactinHotelLoginPom();
		obj.getUsername().sendKeys(AdactinTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "login", 1, 0));
		obj.getPassword().sendKeys(AdactinTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "login", 1, 1));
		obj.getLogin().click();

		
//-----------------------Search------------------------------		
		
		
		AdactinHotelLoginPom search = new AdactinHotelLoginPom();
		search.getLocation().sendKeys(AdactinTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "search a hotel", 0, 0));
		search.getHotel().sendKeys(AdactinTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "search a hotel", 0, 1));
		search.getRoomtype().sendKeys(AdactinTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "search a hotel", 0, 2));
	    search.getRoomnos().sendKeys(AdactinTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "search a hotel", 0, 3));
	    search.getAdultperrooms().sendKeys(AdactinTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "search a hotel", 0, 6));
	    search.getChildperrooms().sendKeys(AdactinTest.excelReader("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\Adactin hotel test data new.xlsx", "search a hotel", 0, 7));
	    search.searchButton();
	    
//-----------------------Select---------------------------------	    
	    
	    AdactinHotelLoginPom select = new AdactinHotelLoginPom();
	    select.radiobuttonclick();
	    select.clickcontinueButton();
	    
	    
	}

	
	
	

}
