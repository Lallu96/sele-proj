package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day77 {
	public static void main(String[] args) throws IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://greenstech.in/selenium-course-content.html");
				
				driver.manage().window().maximize();
				
                JavascriptExecutor js =(JavascriptExecutor)driver;
				
				driver.findElement(By.xpath("//div[@id='heading20']")).click();
											
				TakesScreenshot tk = (TakesScreenshot)driver;
				
				File temp = tk.getScreenshotAs(OutputType.FILE);
				
				File des = new File("C:\\Users\\Kish\\eclipse-workspace\\SeleProj\\ScreenShots\\day77.png");
				
				FileUtils.copyFile(temp, des);
				
				System.out.println("Done");

}}
