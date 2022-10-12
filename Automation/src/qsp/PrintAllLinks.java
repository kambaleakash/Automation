package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the URL to check the all links inside it");
		String url=s.next();
		
		WebDriver d= new ChromeDriver();
		d.get(url);
		List<WebElement> allLinks = d.findElements(By.tagName("a"));
		int count=allLinks.size();
		System.out.println("Total no of links present inside "+url+" is "+count);
		
		/*
		 * for (int i = 0; i < count; i++) { String result = allLinks.get(i).getText();
		 * System.out.println(result); }
		 */
		
		for(WebElement a:allLinks)
		{
			System.out.println(a.getText());
		}
		d.close();
	}
	

}
