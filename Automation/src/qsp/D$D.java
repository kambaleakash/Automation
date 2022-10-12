package qsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D$D 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Drag and drop")).click();
		driver.findElement(By.linkText("Our local demo")).click();
		
		Set<String> awh = driver.getWindowHandles();
		
		for(String ob:awh)
		{
			driver.switchTo().window(ob);
			String title = driver.getTitle();
			if(title.equals("iGoogle like Drag & Drop Portal v2.0 by Michel Hiemstra"))
			{
				Actions a=new Actions(driver);
				WebElement src=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		    	WebElement dest=driver.findElement(By.xpath("//h1[text()='Block 4']"));
		    	a.dragAndDrop(src, dest).perform();
				
			}
		}
		
//		Actions a=new Actions(driver);
//		WebElement src=driver.findElement(By.xpath("//h1[text()='Block 1']"));
//		WebElement dest=driver.findElement(By.xpath("//h1[text()='Block 4']"));
//		a.dragAndDrop(src, dest).perform();

	}

}
