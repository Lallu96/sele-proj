package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Day101 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/\r\n");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphones x");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		Thread.sleep(2000);
		
		WebElement firstPhone = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone X, 64GB, Space Gray - Fully Unlocked ')]"));
		
		Actions ac = new Actions(driver);
		
		ac.contextClick(firstPhone).perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
         r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		 String parId = driver.getWindowHandle();
			
			System.out.println(parId);
			
			Set<String> allId = driver.getWindowHandles();
			
			
			System.out.println(allId);
			
			for (String Id : allId) {
				
				if (!parId.equals(Id)) {
					
					driver.switchTo().window(Id);
				}}
			
			Thread.sleep(2000);
			
			List<String> li = new ArrayList<String> ();
			
			li.addAll(allId);
			
			driver.switchTo().window(li.get(1));
			
			Thread.sleep(2000);
		
		WebElement txtPrint = driver.findElement(By.xpath("//span[@id='productTitle']"));
		
		String text = txtPrint.getText();
				
		System.out.println(text);
				

}}
