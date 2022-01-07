package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day611 {
	public static void main(String[] args) throws IOException, InterruptedException  {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kish\\eclipse-workspace\\Selenium7Pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File temp = tk.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\Kish\\eclipse-workspace\\SeleProj\\ScreenShots\\day71.png");
		
		Thread.sleep(2000);
		
		FileUtils.copyFile(temp, des);
		
		System.out.println("completed");
	}

}
