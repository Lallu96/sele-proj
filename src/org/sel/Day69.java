package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day69 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Actions ac = new Actions(driver);
		
		WebElement mouseHov = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		ac.moveToElement(mouseHov).perform();
				
		driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();
		
		Thread.sleep(2000);
				
		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		
		txtEmail.sendKeys("lalith@gmail.com");
								
		Thread.sleep(2000);
						
		Robot r =new Robot();
		
        Thread.sleep(2000);
        
        r.keyPress(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
        r.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(2000);
		
        r.keyPress(KeyEvent.VK_A);
		
		Thread.sleep(2000);
		
        r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
		ac.contextClick(txtEmail).perform();
		
		Thread.sleep(2000);
        
        r.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
        r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
        r.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
        r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		 r.keyPress(KeyEvent.VK_DOWN);
			
			Thread.sleep(2000);
			
	        r.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(2000);
		
		 r.keyPress(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
			
	        r.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
		

}}

