package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion5 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("qspiders");
		List<WebElement> sugg = d.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
		
		/*
		 * for (int i = 0; i < sugg.size(); i++) {
		 * System.out.println(sugg.get(i).getText());
		 * 
		 * }
		 */
		
		for(WebElement a:sugg)
		{
			System.out.println(a.getText());
		}
		
		sugg.get((sugg.size())-1).click();
		
		
				
		

	}

}
