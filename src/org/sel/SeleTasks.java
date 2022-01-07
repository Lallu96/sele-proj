package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleTasks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebElement txtFrom = driver.findElement(By.id("src"));
		txtFrom.sendKeys("salem");
		
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("chennai");
		
		WebElement txtDate = driver.findElement(By.id("onward_cal"));
		txtDate.sendKeys("26-Nov-2021");
		
		WebElement btnSearch = driver.findElement(By.id("search_btn"));
		btnSearch.click();
		
		
		
		
		
		
	}

}
