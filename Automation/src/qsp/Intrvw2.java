package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intrvw2 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/");
		d.findElement(By.xpath("//a[text()='VIEW ALL COURSES']")).click();
		List<WebElement> link1 = d.findElements(By.xpath("//div[@class='course-listing-title']"));
		List<WebElement> link2 = d.findElements(By.xpath("//div[@class='small course-price']"));
		
		
		for (int i = 0; i < link1.size(); i++) 
		{
			 String course = link1.get(i).getText();
			 String price = link2.get(i).getText();
			 System.out.println(i+">"+course+"-->"+price);
			
		}
		
		
		d.findElement(By.linkText("Next ›")).click();
		List<WebElement> link3 = d.findElements(By.xpath("//div[@class='course-listing-title']"));
		List<WebElement> link4 = d.findElements(By.xpath("//div[@class='small course-price']"));
		
		
		d.close();
		
		
	}

}


