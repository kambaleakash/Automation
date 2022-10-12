package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetions1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> sugg = d.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=sugg.size();
		
		/*
		 * for (int i = 0; i < count; i++) { System.out.println(sugg.get(i).getText());
		 * 
		 * }
		 */
		
		for(WebElement a:sugg)
		{
			System.out.println(a.getText());
		}
		
		sugg.get(1).click();

		
	}

}
