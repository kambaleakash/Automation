package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListDOB
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		WebElement dayList = driver.findElement(By.id("day"));
		WebElement monthList = driver.findElement(By.id("month"));
		WebElement yearList = driver.findElement(By.id("year"));
		
		Select s1=new Select(dayList);
		Select s2=new Select(monthList);
		Select s3=new Select(yearList);
		
		s1.selectByValue("28");
		s2.selectByValue("12");
		s3.selectByVisibleText("1997");
		

	}

}
