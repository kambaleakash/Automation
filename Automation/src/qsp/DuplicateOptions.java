package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateOptions 
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

		Set<String> st=new HashSet<>();
		System.out.println("The duplicate options");
		System.out.println("----------------------");
		for (int i = 0; i <allOptions.size(); i++) 
		{
			if(st.add(allOptions.get(i).getText())==false)
			{
				System.out.println(allOptions.get(i).getText());
			}

		}
	}

}
