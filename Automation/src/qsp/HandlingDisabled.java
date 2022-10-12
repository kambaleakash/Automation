package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabled
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/Disable.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
	//	driver.findElement(By.id("d2")).sendKeys("manager");
		
		
		RemoteWebDriver r=(RemoteWebDriver) driver;
		r.executeScript("document.getElementById(\"d2\").value=\"manager\"\r\n"+ "");
		driver.findElement(By.id("d3")).click();
		r.executeScript("document.getElementById(\"d2\").value=\"\"");
	
		

	}

}
