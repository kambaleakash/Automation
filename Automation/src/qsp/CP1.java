package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CP1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		Actions a=new Actions(driver);
		WebElement target = driver.findElement(By.linkText("actiTIME Inc."));
		a.contextClick(target).perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		
		
		
		
		
//		Set<String> allwh = driver.getWindowHandles();
//		int count = allwh .size();
//		
//		String actualTitle = "actiTIME - Time Tracking Software for Smart Teams";
		
//		for( String asd: allwh )
//		{
//			
//			driver.switchTo().window(asd);
//			if(driver.getTitle().equals(actualTitle))
//			{
//				driver.findElement(By.xpath("(//li[@class='header__li header__li--parent'])[4]")).click();
//				driver.findElement(By.xpath("//p[text()='Overtime Calculator']")).click();
//			}
//			
//			
//		}
		
		
//		Iterator it=allwh.iterator();
//		while(it.hasNext())
//		{
//			driver.switchTo().window((String) it.next());
//			if(driver.getTitle().equals(actualTitle))
//			{
//				driver.close();
//			}
//			else
//				driver.close();
//			
//		}
		
		
		
		//driver.quit();
		

	}

}
