package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MH4 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("openwindow")).click();
		Set<String> awh = driver.getWindowHandles();
		
		for(String st:awh)
		{
			driver.switchTo().window(st);
			if(driver.getTitle().contains("QA Click Academy"))
			{
				String text=driver.findElement(By.xpath("//h3[text()='30 day Money Back Guarantee']/../p")).getText();
				System.out.println(text);
			}
		}
		
	}

}
