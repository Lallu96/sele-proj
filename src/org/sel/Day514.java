package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day514 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		Thread.sleep(2000);
				
		WebElement drop = driver.findElement(By.xpath("//span[contains(text(),\"Men's Fashion\")]"));
		
		ac.moveToElement(drop).perform();
				     		
		driver.findElement(By.xpath("//body/div[@id='content_wrapper']/div[3]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[1]/p[10]/a[1]/span[1]")).click();

}}
