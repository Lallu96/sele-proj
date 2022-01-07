package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day72 {
	public static void main(String[] args) throws IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.amazon.in/");
				
				driver.manage().window().maximize();
				
								
				JavascriptExecutor js =(JavascriptExecutor)driver;
				
				WebElement btnRec = driver.findElement(By.xpath("//div[contains(text(),'Get to Know Us')]"));
				
				js.executeScript("arguments[0].scrollIntoView(true)",btnRec);
				
                WebElement btnRecu = driver.findElement(By.xpath("//span[contains(text(),'More everyday essentials to explore')]"));
				
				js.executeScript("arguments[0].scrollIntoView(false)",btnRecu);
				
				
				
	

}}
