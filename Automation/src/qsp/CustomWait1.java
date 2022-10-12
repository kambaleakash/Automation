package qsp;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		try
		{
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("Page is loaded within 5 seconds");
		}
		
		catch(org.openqa.selenium.TimeoutException e)
		{
			 System.out.println("Page is not loaded within 5 seconds");
		}
	}

}
