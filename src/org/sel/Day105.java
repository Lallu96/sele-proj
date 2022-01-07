package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Day105 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
						
		WebElement btnClick = driver.findElement(By.xpath("//a[contains(text(),'COURSES')]"));
						
		Actions ac = new Actions(driver);
		
		ac.moveToElement(btnClick).perform();
		
		driver.findElement(By.xpath("//span[text()='Python']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("(//button[@data-dismiss='modal'])[1]")).click();
		
		Thread.sleep(2000);
		
		WebElement btnClick2 = driver.findElement(By.xpath("//body/section[@id='masterprgm-container']/div[1]/div[1]/div[2]/a[1]/button[1]"));
		
		ac.contextClick(btnClick2).perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
        r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		 String parId = driver.getWindowHandle();
			
			System.out.println(parId);
			
			Set<String> allId = driver.getWindowHandles();
			
			System.out.println(allId);
			
			for (String Id : allId) {
				
				if (!parId.equals(Id)) {
					
					driver.switchTo().window(Id);
				}}
			
			Thread.sleep(2000);
			
			List<String> li = new ArrayList<String> ();
			
			li.addAll(allId);
			
			driver.switchTo().window(li.get(0));

}}
