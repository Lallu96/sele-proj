package org.sel;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day104 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/python-training.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
		driver.findElement(By.xpath("(//button[@data-dismiss='modal'])[1]")).click();
												
		driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']")).click();
				
		driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']")).click();
						
		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
		
		Thread.sleep(2000);
		
        String parId = driver.getWindowHandle(); 
		
		System.out.println(parId);
		
		Set<String> allId = driver.getWindowHandles();
		
		System.out.println(allId);
		
		for (String Id : allId) {
			
			if (!parId.equals(Id)) {
				
				driver.switchTo().window(Id);
			}}
		
		Thread.sleep(2000);
		
		List<String> li = new ArrayList<String> ();
		
		li.addAll(allId);
		
		driver.switchTo().window(li.get(1));
		
		WebElement txtPrint = driver.findElement(By.xpath("//pre[contains(text(),'Search iphones X and right click')]"));
		
		String text = txtPrint.getText();
		
		System.out.println(text);
		
        

}}
