package org.sel;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1203 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement printAdd = driver.findElement(By.xpath("//input[@id='email']"));
		
		js.executeScript("arguments[0].setAttribute('value','litzbesmart@gmail.com')", printAdd);
		
        WebElement txtPass = driver.findElement(By.xpath("//div[@id='passContainer']"));
		
		js.executeScript("arguments[0].setAttribute('value','90424')", txtPass);
		
        WebElement btnLogin = driver.findElement(By.name("login"));
		
		js.executeScript("arguments[0].click()", btnLogin);
		

}}
