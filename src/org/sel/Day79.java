package org.sel;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day79 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File temp = tk.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\Kish\\eclipse-workspace\\SeleProj\\ScreenShots\\day79.png");
		
		FileUtils.copyFile(temp, des);
		
		System.out.println("Done");
	
}}
