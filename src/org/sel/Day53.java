package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day53 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();		
		
	    Thread.sleep(2000);
	
	    Actions ac = new Actions(driver);
		
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement drop = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		ac.moveToElement(drop).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Bath Towels']")).click();
		
		Thread.sleep(2000);
		
		WebElement printEle = driver.findElement(By.xpath("//a[@title='Flipkart SmartBuy Cotton 380 GSM Bath Towel']"));
		
		String text = printEle.getText();
		
		System.out.println(text);

}}
