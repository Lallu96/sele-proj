package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day36 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='signin-block']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("9042444085");
		
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();
		
		driver.findElement(By.xpath("//div[@id='otp-container']")).click();
		
		
		

}}
