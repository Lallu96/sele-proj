package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day52 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ ");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		WebElement drop = driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]"));
		
		ac.moveToElement(drop).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Your Prime Membership')]")).click();
		
		
		}}
