package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day42 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
				
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9042444085");
		
				
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("lalith kishore");
		
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("litzbesmart55@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("kishore");
		
		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
		

}}
