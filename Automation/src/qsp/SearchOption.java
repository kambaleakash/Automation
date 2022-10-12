package qsp;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SearchOption 
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
		WebElement allOptions = s.getWrappedElement();

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your order");
		String order = sc.nextLine();
		
		if(allOptions.getText().contains(order))
			System.out.println("Your order is available");
		else
			System.out.println("Your order is not available");

		
	}
}
