package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HackerEarth
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement target1 = driver.findElement(By.linkText("Resources"));
		
		Actions a=new Actions(driver);
		a.moveToElement(target1).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		
//		int y = driver.findElement(By.linkText("READ FULL STORY")).getLocation().getY();
//		
//		JavascriptExecutor j=(JavascriptExecutor) driver;
//		j.executeScript("window.scrollBy(0,"+y+")");
//		
	
//	Robot r=new Robot();
//	r.keyPress(KeyEvent.VK_CONTROL);
//	r.keyPress(KeyEvent.VK_MINUS);
//	r.keyPress(KeyEvent.VK_MINUS);
//	r.keyRelease(KeyEvent.VK_CONTROL);
//	Thread.sleep(5000);
	
		
		a.doubleClick(driver.findElement(By.linkText("READ FULL STORY"))).perform();
		
		if(driver.getTitle().contains("HackerEarth"))
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		
		
		

	}

}
