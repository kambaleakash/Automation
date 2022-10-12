package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion4 
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
		d.findElement(By.xpath("//button[text()='✕']")).click();
		d.findElement(By.name("q")).sendKeys("iphone 13 pro max"+Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> name = d.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]"));
		List<WebElement> price = d.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]/../../div[2]/div[1]/div[1]/div"));
		
		/*
		 * for (int i = 0; i < price.size(); i++) {
		 * System.out.println(name.get(i).getText()+"-->"+price.get(i).getText());
		 * 
		 * }
		 */
		
		for (WebElement a : name) 
		{
			for (WebElement b : price) 
			{
				String s=((WebElement) price).getText();
				int range=Integer.parseInt(s);
				if(range>80000 || range<180000)
				System.out.println(a.getText()+"-->"+b.getText());
			}
			
		}
	}

}
