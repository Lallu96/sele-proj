package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day27 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Lalith");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Kishore");
		
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Salem");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("litzbesmart@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9042444085");
		
		
		
		
		
		
		

}}
