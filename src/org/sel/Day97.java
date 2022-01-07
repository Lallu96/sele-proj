package org.sel;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day97 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
			
		WebElement btnDrop = driver.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]"));
		
		Select s = new Select(btnDrop);
		
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size() ; i++) {
									
			WebElement element = options.get(i);
			
			String attribute = element.getAttribute("value");
			
			System.out.println(attribute);

}}}
