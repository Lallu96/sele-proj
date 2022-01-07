package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day49 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("iphone");
		
		driver.findElement(By.xpath("//body/div[@id='sdHeader']/div[4]/div[2]/div[1]/div[2]/button[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[contains(text(),'Apple iPhone 7 Shock Proof Case Shining Stars - Transparent')]")).click();
		

}}
