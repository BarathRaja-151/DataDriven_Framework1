package org.alertdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
public static void main(String[] args)  {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://letcode.in/alert");
	
	driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
	
	Alert alertpopup = driver.switchTo().alert();
	alertpopup.accept();
	
	WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm Alert']"));
	confirm.click();
	
	Alert alert2 = driver.switchTo().alert();
	alert2.dismiss();
	
	WebElement Prompt = driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
	Prompt.click();
	
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("Barath Raja");
	alert.accept();
	
	WebElement Modernalert = driver.findElement(By.xpath("//button[text()='Modern Alert']"));
	Modernalert.click();
	
	
}
}
