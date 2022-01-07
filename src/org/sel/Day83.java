package org.sel;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day83 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		
		Alert al = driver.switchTo().alert();
		
		al.sendKeys("Lalith");
		
		String text = al.getText();
		
		System.out.println(text);


}}
