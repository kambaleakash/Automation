package com.actitime.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class DemoScreenShot 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void abc() throws IOException
	{
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.selenium.dev/");
	 TakesScreenshot t=(TakesScreenshot)driver;
	 
	 File src = t.getScreenshotAs(OutputType.FILE);
	 File dst = new File("./screenshot/"+Math.random()+".png");
	 FileUtils.copyFile(src, dst);
	 driver.close();
	 
	}
	
	@Test
	public void efg() throws IOException 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	 TakesScreenshot t=(TakesScreenshot)driver;
	 
	 File src = t.getScreenshotAs(OutputType.FILE);
	 File dst = new File("./screenshot/"+Math.random()+".png");
	 FileUtils.copyFile(src, dst);
	 driver.close();
	 
	}
	
	
	

}
