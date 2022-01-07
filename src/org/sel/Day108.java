package org.sel;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day108 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/ ");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("hand sanitizer");
		
		driver.findElement(By.xpath("//body/div[@id='sdHeader']/div[4]/div[2]/div[1]/div[2]/button[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[@id='content_wrapper']/div[7]/div[5]/div[3]/div[8]/section[1]/div[1]/div[2]/a[1]/picture[1]/img[1]")).click();
		
		String parId = driver.getWindowHandle();
		
		Set<String> allId = driver.getWindowHandles();
		
		for (String Id : allId) {
			
			if (!parId.equals(Id)) {
				
				driver.switchTo().window(Id);
			}}
		
        Thread.sleep(2000);
		
		List<String> li = new ArrayList ();
		
		li.addAll(allId);
		
		driver.switchTo().window(li.get(1));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'add to cart')]")).click();
		
}}
