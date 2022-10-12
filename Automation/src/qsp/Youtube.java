package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)  
	{
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		d.get("https://www.youtube.com/");
		//ElementNotInteractableException
		//d.findElement(By.id("container")).sendKeys("jagave ninu gelatiye");
		d.findElement(By.xpath("//input[@id='search']")).sendKeys("jagave ninu gelatiye");
		d.findElement(By.id("search-icon-legacy")).click();
	d.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
//		d.findElement(By.xpath("//div[@id='ad-text:6']")).click();
//		d.findElement(By.xpath("//button[@title='Full screen (f)']")).click();

	}

}
