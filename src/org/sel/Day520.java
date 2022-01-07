package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day520 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//a[text()='Explore']")).click();
		
		Thread.sleep(2000);
				
		WebElement drop = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[2]"));
		
		ac.moveToElement(drop).perform();
		
		Thread.sleep(2000);
		
       				     		
		driver.findElement(By.xpath("//a[@title='Mi']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Mi 5X 108 cm (43 inch) Ultra HD (4K) LED Smart And')]")).click();
		

}}




