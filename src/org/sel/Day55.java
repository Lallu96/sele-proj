package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day55 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.htmlm");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
				
		WebElement drop = driver.findElement(By.xpath("//a[contains(text(),'Sports & More')]"));
		
		ac.moveToElement(drop).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Weight Gainers')]")).click();
		
		
}}
