package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day22 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/ ");
		
		WebElement txtFrom = driver.findElement(By.xpath("//input[@id='src']"));
		
		txtFrom.sendKeys("Salem");
		
        WebElement txtTo = driver.findElement(By.xpath("//input[@id='dest']"));
		
		txtTo.sendKeys("Bangalore");
		
		
		
		

}}
