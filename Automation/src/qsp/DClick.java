package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DClick 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement target1 = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(target1).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		
        WebElement target2 = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(target2).perform();
		
		String ExpTitle = "HackerEarth Case Study | Vtiger CRM";
		String ActTitle=driver.getTitle();
		System.out.println(ActTitle);
		
		if(ActTitle.equals(ExpTitle))
			System.out.println("Pass");
		else
			System.out.println("fail");
	}
}
