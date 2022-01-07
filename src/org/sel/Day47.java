package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day47 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("greens velmurugan");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h3[contains(text(),'Velmurugan K - Technical Manager - GTL Limited | L')]")).click();
		
		
		
		

}}
