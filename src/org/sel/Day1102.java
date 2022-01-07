package org.sel;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1102 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.id("customers"));
		
		List <WebElement> tableRows = table.findElements(By.tagName("tr"));
														
			WebElement row = tableRows.get(1);
									
			List<WebElement> tableDatas = row.findElements(By.tagName("td"));
			
			for (int j = 0; j < tableDatas.size(); j++) {
				
				WebElement data = tableDatas.get(j);
				
				String text1 = data.getText();
				
				System.out.println(text1);

}}}
