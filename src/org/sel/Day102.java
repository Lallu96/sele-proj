package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Day102 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("iphones 7");

		driver.findElement(By.xpath("//body/div[@id='sdHeader']/div[4]/div[2]/div[1]/div[2]/button[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//img[@class='product-image '])[1]")).click();

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

		WebElement clickBtn = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));

		clickBtn.click();

		Thread.sleep(2000);

		WebElement txtPrint = driver.findElement(By.xpath(
				"//body/div[@id='content_wrapper']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]"));

		String text = txtPrint.getText();

		System.out.println(text);

		System.out.println("sel 7pm");

		System.out.println("sel 9pm");

		System.out.println("sel 7pm");

		System.out.println("sel 9pm");

	}
}
