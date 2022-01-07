package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day45 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='overview-tab']")).click();
		
		Thread.sleep(2000);
		
		WebElement txtTag = driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
		
		String text = txtTag.getText();
		
		System.out.println(text);

}}
