package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlhabeticOptions 
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
		
		System.out.println("Before sorting the options");
		System.out.println("---------------------------");
		for (int i = 0; i < allOptions.size(); i++) 
		{
			String option = allOptions.get(i).getText();
			System.out.println(option);	
		}
		System.out.println();
		
		
		Set<String> lt=new TreeSet<>();
		List<String> st=new ArrayList<>();
		for (int i = 0; i < allOptions.size(); i++) 
		{
			lt.add(allOptions.get(i).getText());
			st.add(allOptions.get(i).getText());
		}
		
		
		System.out.println("After sorting options using Treeset");
		System.out.println("------------------------------------");
		for (String str : lt) 
		{
			System.out.println(str);
		}
		System.out.println();
		
		
		System.out.println("After sorting the options using sort()");
		System.out.println("---------------------------");
		Collections.sort(st);
		for (String str : st) 
		{
			System.out.println(str);
		}
		
		
		

}

}
