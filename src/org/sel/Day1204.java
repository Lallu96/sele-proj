package org.sel;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1204 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://toolsqa.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.findElement(By.xpath("(//button[@aria-label='Close modal'])[2]")).click();
				
		WebElement printAdd = driver.findElement(By.xpath("//a[text()='Selenium']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", printAdd);


}}
