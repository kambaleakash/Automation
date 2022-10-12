package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChildPopup2 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the title of browser you want to close");
		String expectedTitle=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		
		Set<String> awh = driver.getWindowHandles();
		for(String wh:awh)
		{
			driver.switchTo().window(wh);
			String actualTitle = driver.getTitle();
			
			if(actualTitle.contains(expectedTitle))
			{
				driver.close();
				
			}
				
				
		}
		

	}

}
