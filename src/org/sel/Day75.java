package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day75 {
	public static void main(String[] args) throws IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://greenstech.in/selenium-course-content.html");
				
				driver.manage().window().maximize();
				
                JavascriptExecutor js =(JavascriptExecutor)driver;
                
                Thread.sleep(2000);
				
				WebElement btnRec = driver.findElement(By.xpath("//h2[contains(text(),'Job Openings')]"));
				
				js.executeScript("arguments[0].scrollIntoView(true)",btnRec);
				
				WebElement btnRecu = driver.findElement(By.xpath("//h3[contains(text(),'Online Classroom')]"));
					
			    js.executeScript("arguments[0].scrollIntoView(false)",btnRecu);
					

}}
