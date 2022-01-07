package org.sel;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1201 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement printAdd = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", printAdd);
		
		String text = printAdd.getText();
		
		System.out.println(text);

}}
