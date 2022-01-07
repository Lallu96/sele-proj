package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day501 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement txtUser = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		txtUser.sendKeys("lalith");
		
        String attribute = txtUser.getAttribute("value");
		
		System.out.println(attribute);
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
		txtPass.sendKeys("kishore");
				
		String attribute2 = txtPass.getAttribute("value");
		
		System.out.println(attribute2);


}}
