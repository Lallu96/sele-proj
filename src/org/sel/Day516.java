package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day516 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
				
		WebElement drop = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[2]/div[1]/div[1]"));
		
		ac.moveToElement(drop).perform();
		
		Thread.sleep(2000);
		
       WebElement drop1 = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[6]"));
		
		ac.moveToElement(drop1).perform();
		
		Thread.sleep(2000);

				     		
		driver.findElement(By.xpath("//a[contains(text(),'Women Flats')]")).click();
		
		

}}
