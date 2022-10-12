package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Basic Auth")).click();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		

	}

}
