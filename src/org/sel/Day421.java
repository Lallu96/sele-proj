package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day421 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		
		txtEmail.sendKeys("litzbesmart55@mail.com");
		
		String attribute = txtEmail.getAttribute("value");
		
		System.out.println(attribute);
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
		
		txtPass.sendKeys("9042444085");
		
		String attribute2 = txtPass.getAttribute("value");
		
		System.out.println(attribute2);
		
		}}
