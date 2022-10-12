package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth");
		String expectedTitle = driver.getTitle();
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		
		Set<String> awh = driver.getWindowHandles();
		for(String wh:awh)
		{
			driver.switchTo().window(wh);
			String actualTitle = driver.getTitle();
		
			if(!actualTitle.equals(expectedTitle))
				driver.close();
			
		}
		
	}

}
