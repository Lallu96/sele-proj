package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day38 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//h2[contains(text(),'Model Resumes')]")).click();
		
				
		driver.findElement(By.xpath("//a[contains(text(),'Resume Model-1')]")).click();
		


}}
