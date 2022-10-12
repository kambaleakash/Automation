package qsp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup3 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		
		Set<String> awhs = driver.getWindowHandles();
		List<String> awhl=new ArrayList<>(awhs);
		
		Iterator<String> i=awhs.iterator();
		while(i.hasNext())
		{
			driver.switchTo().window(i.next());
			String title = driver.getTitle();
			System.out.println(title);
		}

		ListIterator<String> l=awhl.listIterator();
		while(l.hasNext())
		
		while(l.hasPrevious())
		{
			driver.switchTo().window(l.previous());
			driver.close();
		}
	}
}
