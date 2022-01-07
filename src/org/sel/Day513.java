package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day513 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Actions ac = new Actions(driver);
				
		WebElement drop = driver.findElement(By.xpath("//span[contains(text(),'Mobile & Accessories')]"));
		
		ac.moveToElement(drop).perform();
				     		
		driver.findElement(By.xpath("//span[contains(text(),'Plain Back Covers')]")).click();

}}
