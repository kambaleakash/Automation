package qsp;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChild 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> awh = driver.getWindowHandles();
		
		Iterator it=awh.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window((String) it.next());
			if(driver.getTitle().equals("actiTIME - Time Tracking Software for Smart Teams"))
			{
				
				driver.close();
			}
		}
		
//		for(String st:awh)
//		{
//			driver.switchTo().window(st);
//			String title=driver.getTitle();
//			System.out.println(title);
//			if(title.equals("actiTIME - Time Tracking Software for Smart Teams"))
//				driver.close();
//		
//		}

	}

}
