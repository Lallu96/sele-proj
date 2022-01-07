package org.sel;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day911 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("lalith1528");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Appa1996$");
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		Thread.sleep(2000);
		
				
		WebElement btnDrop = driver.findElement(By.xpath("//select[@name='adult_room']"));
		
		Select s = new Select(btnDrop);
		
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size() ; i++) {
			
						
			WebElement element = options.get(i);
			
			String text = element.getText();
			
			System.out.println(text);

}}}
