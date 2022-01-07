package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day23 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://infinity.icicibank.com/corp/Login.jsp");
							
		driver.findElement(By.name("DUMMY1")).click();
					
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("lalith");
				
        WebElement txtPass = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
	        
		txtPass.sendKeys("kishore");
		
       

}}
