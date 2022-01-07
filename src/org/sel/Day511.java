package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day511 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.homedepot.com/\r\n");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
				
		WebElement drop = driver.findElement(By.xpath("//a[contains(text(),'All Departments')]"));
		
		ac.moveToElement(drop).perform();
		
		Thread.sleep(2000);
		
       WebElement drop1 = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='header']/div[1]/div[5]/div[1]/section[1]/div[1]/ul[1]/li[12]/a[1]"));
		
		ac.moveToElement(drop1).perform();
		
		WebElement drop2 = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='header']/div[1]/div[5]/div[1]/section[2]/div[1]/ul[1]/li[9]/a[1]"));
		
		ac.moveToElement(drop2).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Portable Air Conditioners')]")).click();
		
		

}}
