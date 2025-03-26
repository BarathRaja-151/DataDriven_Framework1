package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class AdactinHotelLoginPom extends BaseClass{
	
	//constructor
	
	public AdactinHotelLoginPom() {
		PageFactory.initElements(driver, this);
		
	}
	
	//webElement
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement login;
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@id='room_type']")    
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@id='room_nos']") 
	private WebElement roomnos;
	
	@FindBy(xpath="//select[@id='adult_room']") 
	private WebElement adultperroom;
	

	@FindBy(xpath="//select[@id='child_room']") 
	private WebElement childperroom;
	
	
	
	
	
	
	
	//methods
	
	public WebElement getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username.sendKeys(username);
	}
		
	public WebElement getPassword() {
		return password;
	}
		
	public WebElement getLogin() {
		return login;
				
	}
	
	public WebElement getLocation() {
		return location;
		
	}
	
	public WebElement getHotel() {
		return hotels;
	}
	
	public WebElement getRoomtype() {
		return roomtype;
	}
	
	public WebElement getRoomnos() {
		return roomnos;
	}
	
	public WebElement getAdultperrooms() {
		return adultperroom;
	}
	
	public WebElement getChildperrooms() {
		return childperroom;
	}
	
		
	
		
		



	
}
