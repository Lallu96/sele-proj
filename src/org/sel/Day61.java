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

public class Day61 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));

		txtEmail.sendKeys("lalith@gmail.com");

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_A);

		r.keyRelease(KeyEvent.VK_A);

		r.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_X);

		Thread.sleep(2000);

		r.keyRelease(KeyEvent.VK_X);

		Thread.sleep(2000);

		r.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='pass']")).click();

		r.keyPress(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_V);

		Thread.sleep(2000);

		r.keyRelease(KeyEvent.VK_V);

		Thread.sleep(2000);

		r.keyRelease(KeyEvent.VK_CONTROL);

	}
}
