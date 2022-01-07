package org.sel;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day711 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Explore']")).click();
		
		Thread.sleep(2000);
		
		Actions ac = new Actions(driver);
		
		WebElement btnWomen = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[4]"));
		
		ac.moveToElement(btnWomen).perform();
		
		Thread.sleep(2000);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File temp = tk.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\Kish\\eclipse-workspace\\SeleProj\\ScreenShots\\day711.png");
		
		FileUtils.copyFile(temp, des);
		
		System.out.println("Done");
	

}}
