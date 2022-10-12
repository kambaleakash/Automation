package qsp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intrvw1 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		boolean display=d.findElement(By.xpath("//label[@for='radio1']")).isDisplayed();
		if(display==true)
		{
			System.out.println("Radio button1 is displayed and pass");
			System.out.println("------------------------------------");
		}
		else
		{
			System.out.println("Radio button1 is not displayed and fail");
			System.out.println("---------------------------------------");
		}
		
		d.findElement(By.name("radioButton")).click();
		boolean select=d.findElement(By.name("radioButton")).isSelected();
		if(select==true)
		{
			System.out.println("Button is selected and pass");
			System.out.println("---------------------------------");
		}
		else
		{
			System.out.println("Button is not selected and fail");
			System.out.println("---------------------------------");
		}

		
		d.findElement(By.id("autocomplete")).sendKeys("India"+Keys.ENTER);
		List<WebElement> sugg = d.findElements(By.xpath("//li/div[contains(text(),'India')]"));
		for (int i = 0; i < sugg.size(); i++) 
		{
			if(sugg.get(i).getText().equals("India"))
				sugg.get(i).click();
			
		}
		
		d.findElement(By.id("opentab")).click();
		String title=d.getTitle();
		
		System.out.println("Title:"+title);
		System.out.println("---------------------");
		
		System.out.println(d.findElement(By.xpath("//td[text()='Rahul Shetty']")).getText());
		System.out.println(d.findElement(By.xpath(" (//td[text()='Rahul Shetty'])[1]")).getText().equals("Rahul Shetty"));
		
		
		List<WebElement> price = d.findElements(By.xpath("(//td[text()='Rahul Shetty'])/../td[3]"));
		int count=price.size();
		int sum=0;
		for (int i = 0; i < count; i++)
		{
			String s=price.get(i).getText();
			sum=sum+Integer.parseInt(s);
			
		}
		System.out.println(sum);

	}

}
