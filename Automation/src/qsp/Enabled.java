package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login/");
		boolean result=d.findElement(By.id("loginbutton")).isEnabled();
		if(result==true)
			System.out.println("Button is enabled and pass");
		else
			System.out.println("Button is not enambled and fail");
		d.close();
	}

}
