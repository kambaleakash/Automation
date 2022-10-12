package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login/");
		boolean result=d.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(result==true)
		System.out.println("Logo is displayed and pass");
		else
		System.out.println("Logo is not displayed and fail");
		d.close();

	}

}
