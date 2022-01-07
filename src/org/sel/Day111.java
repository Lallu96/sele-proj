package org.sel;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day111 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/ ");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("hp laptop");
		
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(),'HP Pavilion Ryzen 5 Hexa Core 5600H - (8 GB/512 GB')]")).click();
		
        String parId = driver.getWindowHandle();
		
		Set<String> allId = driver.getWindowHandles();
		
		for (String Id : allId) {
			
			if (!parId.equals(Id)) {
				
				driver.switchTo().window(Id);
			}}
		
        Thread.sleep(2000);
		
		List<String> li = new ArrayList<String> ();
		
		li.addAll(allId);
		
		driver.switchTo().window(li.get(1));
		
		Thread.sleep(2000);
		
		WebElement txtPrice = driver.findElement(By.xpath("(//div[text()='₹61,990'])[1]"));
		
		String text = txtPrice.getText();
		
		System.out.println(text);


}}
