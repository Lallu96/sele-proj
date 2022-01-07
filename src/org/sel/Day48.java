package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day48 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='username']"));
		txtUser.sendKeys("lalith");
		
        String attribute = txtUser.getAttribute("value");
		
		System.out.println(attribute);
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='password']"));
		txtPass.sendKeys("kishore");
				
		String attribute2 = txtPass.getAttribute("value");
		
		System.out.println(attribute2);


}}
