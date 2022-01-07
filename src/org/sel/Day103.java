package org.sel;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day103 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.homedepot.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='headerSearch']")).sendKeys("ceiling fan");

		driver.findElement(By.xpath("//button[@id='headerSearchButton']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[text()='Indoor Ceiling Fans with Remotes'])[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[contains(text(),'Changing Integrated LED')])[1]")).click();

		String parId = driver.getWindowHandle();

		System.out.println(parId);

		Set<String> allId = driver.getWindowHandles();

		System.out.println(allId);

		for (String Id : allId) {

			if (!parId.equals(Id)) {

				driver.switchTo().window(Id);
			}
		}

		Thread.sleep(2000);

		List<String> li = new ArrayList<String>();

		li.addAll(allId);

		driver.switchTo().window(li.get(1));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt='close delivery zip drop down']")).click();

		Thread.sleep(2000);

		WebElement txtPrint = driver.findElement(By.xpath("//div[text()='Easy Returns In Store and Online']"));

		String text = txtPrint.getText();

		System.out.println(text);

	}
}
