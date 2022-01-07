package org.sel;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day91 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement btnDrop = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(btnDrop);
		
		List<WebElement> options = s.getOptions();
		
		for (int i = 1; i < options.size() ; i=i+2) {
									
			WebElement element = options.get(i);
			
			String text = element.getText();
			
			System.out.println(text);
			
			
		}
		
	
		
		

}}
