package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		WebElement btnScrDwn = driver.findElement(By.xpath("(//a[@data-reactid='39'])[2]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", btnScrDwn);
		
				
		WebElement btnScrUp = driver.findElement(By.xpath("(//img[@class='image-image undefined image-hand'])[2]"));
			
		js.executeScript("arguments[0].scrollIntoView(false)", btnScrUp);
		
		
}}
