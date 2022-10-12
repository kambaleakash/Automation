package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames1
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.switchTo().frame(0);
//		String text=driver.findElement(By.xpath("//li[text()=' contact@rahulshettyacademy.com']")).getText();
//		System.out.println(text);
		         
//		driver.switchTo().frame("courses-iframe");
//		driver.findElement(By.partialLinkText("30% OFF on Silver")).click();
		
		WebElement we = driver.findElement(By.id("courses-iframe"));
		driver.switchTo().frame(we);
		driver.findElement(By.xpath("//h3[text()='Create Your Learning Path']")).click();
	}

}
