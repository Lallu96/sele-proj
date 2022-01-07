package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day33 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("lalith");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("kishore");
		
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("salem");
		
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("litzbesmart@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9042444085");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
       
		
		driver.findElement(By.id("msdd")).click();		
		
        driver.findElement(By.xpath("//a[text()='French']")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        
		
}}
