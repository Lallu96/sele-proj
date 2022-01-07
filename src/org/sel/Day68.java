package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day68 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);Thread.sleep(2000);
				
		driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
					
		Thread.sleep(2000);
		
		WebElement txtUser = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		txtUser.sendKeys("lalith@gmail.com");
		
		Robot r =new Robot();
		
        Thread.sleep(2000);
        
        r.keyPress(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
        r.keyPress(KeyEvent.VK_A);
		
		Thread.sleep(2000);
		
        r.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(2000);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);	
		
		r.keyPress(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
        r.keyPress(KeyEvent.VK_C);
		
		Thread.sleep(2000);
		
        r.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(2000);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
       r.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		r.keyRelease(KeyEvent.VK_TAB);
		
		 Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			
			Thread.sleep(2000);
			
	        r.keyPress(KeyEvent.VK_V);
			
			Thread.sleep(2000);
			
	        r.keyRelease(KeyEvent.VK_V);
			
			Thread.sleep(2000);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		

}}
