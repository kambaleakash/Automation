package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingNewTab 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("opentab")).click();
		Set<String> awh = driver.getWindowHandles();
		
		String actTitle="Rahul Shetty Academy";
		
		Iterator it=awh.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window((String) it.next());
			if(driver.getTitle().equals(actTitle))
			{
				Actions a=new Actions(driver);
				WebElement target=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
				a.moveToElement(target).perform();
				WebElement target1 = driver.findElement(By.xpath("//a[text()='Contact']"));
				Thread.sleep(3000);
				a.doubleClick(target1).perform();
				
				String text=driver.findElement(By.xpath("//li[text()='contact@rahulshettyacademy.com']")).getText();
				System.out.println(text);
			}
		}
	

	}

}
