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

public class Day62 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/webhp");

		driver.manage().window().maximize();

		Actions ac = new Actions(driver);

		WebElement txtBox = driver.findElement(By.xpath("//input[@type='text']"));

		txtBox.click();

		txtBox.sendKeys("VelMurugan");

		ac.doubleClick(txtBox).perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_X);

		Thread.sleep(2000);

		r.keyRelease(KeyEvent.VK_X);

		Thread.sleep(2000);

		r.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

	}
}
