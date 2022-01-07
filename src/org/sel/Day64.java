package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day64 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();

		Actions ac = new Actions(driver);

		Thread.sleep(2000);

		WebElement btnFrame = driver.findElement(By.xpath("//h2[contains(text(),'Framework Test Papers')]"));

		btnFrame.click();

		WebElement btnFrame1 = driver.findElement(By.xpath("//a[contains(text(),'DataDriven')]"));

		ac.contextClick(btnFrame1).perform();

		Robot r = new Robot();

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_DOWN);

		Thread.sleep(2000);

		r.keyRelease(KeyEvent.VK_DOWN);

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		r.keyRelease(KeyEvent.VK_ENTER);

	}
}
