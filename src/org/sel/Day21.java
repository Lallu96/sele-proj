package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day21 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/ ");
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		
		txtEmail.sendKeys("litzbesmart@gmail.com");
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
		
		txtPass.sendKeys("12345678");
		
		

}}
