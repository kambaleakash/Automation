package qsp;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class HandlingDisabled1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/Disable.html");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("document.getElementById(\"d2\").value=\"manager\"");
//		RemoteWebDriver r=(RemoteWebDriver) driver;
//		r.executeScript("document.getElementById(\"d2\").value=\"manager\"");
		
		

	}

}
