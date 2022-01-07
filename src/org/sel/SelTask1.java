package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.org.apache.xml.internal.security.keys.content.KeyValue;

public class SelTask1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		WebElement btnCreate = driver.findElement(By.xpath("(//a[@role = 'button'])[2]"));
		
		btnCreate.click();
		
		Thread.sleep(2000);
		
				
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_SHIFT);
		
		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);
		
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);
		
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
		
		r.keyPress(KeyEvent.VK_K);
		r.keyRelease(KeyEvent.VK_K);
		
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		
		r.keyRelease(KeyEvent.VK_SHIFT);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Actions ac1 = new Actions(driver);
		
		ac1.keyDown(Keys.SHIFT).sendKeys("RAVI").keyUp(Keys.SHIFT).perform();
		
		WebElement btnRadio = driver.findElement(By.xpath("(//label[@class = '_58mt'])[2]"));
		
		btnRadio.click();
		
		
		
		
		
		
		
		
		
		
		 
		
}}
