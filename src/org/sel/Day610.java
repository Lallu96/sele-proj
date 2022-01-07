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

public class Day610 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		Actions ac = new Actions(driver);
				
		WebElement btnClick = driver.findElement(By.xpath("//div[contains(text(),'Nike, ADIDAS, Puma..')]"));
		
		ac.contextClick(btnClick).perform();
		
		Thread.sleep(2000);
				
		Robot r = new Robot();
		
        Thread.sleep(2000);
        
        r.keyPress(KeyEvent.VK_UP);
		
		Thread.sleep(2000);
		
        r.keyRelease(KeyEvent.VK_UP);
		
		Thread.sleep(2000);
		
        r.keyPress(KeyEvent.VK_UP);
		
		Thread.sleep(2000);
		
        r.keyRelease(KeyEvent.VK_UP);
		
		Thread.sleep(2000);
		
	    r.keyPress(KeyEvent.VK_UP);
			
		Thread.sleep(2000);
			
	    r.keyRelease(KeyEvent.VK_UP);
			
		Thread.sleep(2000);
		
	    r.keyPress(KeyEvent.VK_ENTER);
			
		Thread.sleep(2000);
			
	    r.keyRelease(KeyEvent.VK_ENTER);
		

}}
