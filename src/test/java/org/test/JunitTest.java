package org.test;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.utility.BaseClass;

public class JunitTest extends BaseClass {
	
	@BeforeClass
	public static void beforeClass() {
		
		JunitTest.browserLaunch("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//System.out.println("Before class");
	}
	
	@Before
	public void before() {
		//System.out.println("Before");
	}
	
	@Test
	public void test1() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Barath");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Barath@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   // System.out.println("Test1");
	 
	}
	
	@Test
	public void test2() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    //System.out.println("Test2");
	 }
	
	@After
	public void after() {
		
		driver.navigate().back();
		driver.navigate().refresh();
		//System.out.println("After");
	}
		
   @AfterClass	
   public static void afterClass() {
	    driver.manage().window().minimize();
	    driver.close();
		//System.out.println("After class");
	 }
	

}
