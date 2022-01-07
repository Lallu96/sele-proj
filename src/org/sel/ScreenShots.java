package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		WebElement txtBox = driver.findElement(By.name("keyword"));
		
		js.executeScript("arguments[0].setAttribute('value','T-Shirts for men')",txtBox);
		
		String text = (String)js.executeScript("return arguments[0].getAttribute('value')",txtBox);
		
		System.out.println(text);
		
		WebElement btnMen = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		
		js.executeScript("arguments[0].click()", btnMen);
		

}}
