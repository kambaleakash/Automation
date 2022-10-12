package qsp;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionsWithoutDuplicate 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/Hotel.html");
		WebElement mtrList = driver.findElement(By.id("mtr"));

		Select s=new Select(mtrList);
		List<WebElement> allOptions = s.getOptions();
		
		System.out.println("All the options with duplicates");
		System.out.println("---------------------------");
		for (int i = 0; i < allOptions.size(); i++) 
		{
			String option = allOptions.get(i).getText();
			System.out.println(option);	
		}
		System.out.println();
		
		
		Set<String> lt=new LinkedHashSet<>();
		for (int i = 0; i < allOptions.size(); i++) 
		{
			lt.add(allOptions.get(i).getText());
			
		}
		
		
		System.out.println("All the options without duplicates");
		System.out.println("------------------------------------");
		for (String str : lt) 
		{
			System.out.println(str);
		}
		System.out.println();
		
		
		
		
		

}   

}
