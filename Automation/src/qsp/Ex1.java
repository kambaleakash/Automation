package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login/");
		d.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		int r1=d.findElement(By.xpath("//label[text()='Female']")).getLocation().getY();
		int r2=d.findElement(By.xpath("//label[text()='Male']")).getLocation().getY();
		int r3=d.findElement(By.xpath("//label[text()='Custom']")).getLocation().getY();
		
		if(r1==r2 && r2==r3 )
			System.out.println("Radio buttons perfectly alligned and pass");
		else
			System.out.println("Radio buttons not alligned correctly and fail");
		
		

	}

}
