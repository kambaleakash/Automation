package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion3 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.bbc.com/");
		List<WebElement> news = d.findElements(By.xpath("//span[@class='top-list-item__bullet']/..//h3[@class='top-list-item__headline']"));
		
		/*
		 * for (int i = 0; i < news.size(); i++) {
		 * System.out.println(i+1+")"+news.get(i).getText());
		 * 
		 * }
		 */
		
		for(WebElement a: news)
		{
			System.out.println(a.getText());
		}

	}

}
