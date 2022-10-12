package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames2 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("a");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("b");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("c");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("d");
		WebElement w=driver.findElement(By.id("f1"));
		driver.switchTo().frame(w);
		driver.findElement(By.id("t2")).sendKeys("e");
	}

}
