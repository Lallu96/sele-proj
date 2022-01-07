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

public class Screenshots1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
        JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		WebElement txtBox = driver.findElement(By.name("keyword"));
		
		js.executeScript("arguments[0].setAttribute('value','T-Shirts for men')",txtBox);
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		
		File temp = tk.getScreenshotAs(OutputType.FILE);
		
		File des = new File ("C:\\Users\\Kish\\eclipse-workspace\\SeleProj\\ScreenShots\\homepage.png");
		
		FileUtils.copyFile(temp, des);
		
		

}}
