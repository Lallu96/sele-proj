package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day502 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html ");
		
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("samsung mobiles");
				
		driver.findElement(By.xpath("//a[@onclick='searchTrigger()']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h2[contains(text(),'SAMSUNG Galaxy A03s (3 GB / 32 GB)  Blue')]")).click();
		
		

}}
