package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day51 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html ");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		
		WebElement dest = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
		
		ac.dragAndDrop(src, dest);
		
        WebElement src1 = driver.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
		
		WebElement dest1 = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
		
		ac.dragAndDrop(src1, dest1);
		
        WebElement src2 = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		
		WebElement dest2 = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
		
		ac.dragAndDrop(src2, dest2);
		
        WebElement src3 = driver.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
		
		WebElement dest3 = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
		
		ac.dragAndDrop(src3, dest3);
		
		

}}
