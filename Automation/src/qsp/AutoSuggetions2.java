package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetions2 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		d.findElement(By.xpath("(//button)[2]")).click();
		d.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(3000);
		List<WebElement> sugg = d.findElements(By.xpath("//span[text()='iphone']/.."));
		int count=sugg.size();
		System.out.println(count+" number of auto suggetions are displaying");
		
		/*
		 * for (int i = 0; i < count; i++) { System.out.println(sugg.get(i).getText());
		 * 
		 * }
		 */
		
		for(WebElement a:sugg)
		{
			System.out.println(a.getText());
		}
		
		sugg.get(count-1).click();
		
		
	}

}
