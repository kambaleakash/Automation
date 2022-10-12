package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocLink 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	};
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/Demo.html");
				
		 
		
		driver.findElement(By.linkText("Qspiders")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Jspiders")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("spider")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("id")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Q")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("J")).click();
		
		
	}

}
