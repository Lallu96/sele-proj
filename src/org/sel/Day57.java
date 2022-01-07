package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day57 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
				
		WebElement drop = driver.findElement(By.xpath("//div[@title='Courses']"));
		
		ac.moveToElement(drop).perform();
		
		Thread.sleep(2000);
		
       WebElement drop1 = driver.findElement(By.xpath("//header/div[@id='main-header-top-greens']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/div[1]"));
		
		ac.moveToElement(drop1).perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Oracle SQL and PLSQL Placement Certification Train')]")).click();

}}
