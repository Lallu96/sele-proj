package org.sel;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day106 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//h2[contains(text(),'Framework Test Papers')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'JUNIT')]")).click();
		
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
			
			WebElement txtPrint = driver.findElement(By.xpath("//pre[contains(text(),'username and password and verify')]"));
			
			String text = txtPrint.getText();
			
			System.out.println(text);
			
			

}}
