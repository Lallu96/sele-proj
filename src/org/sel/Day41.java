package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day41 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9042444085");
				
		driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
		
		
}}
