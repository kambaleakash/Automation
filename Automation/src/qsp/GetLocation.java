package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login/");
		int x=d.findElement(By.id("email_container")).getLocation().getX();
		int y=d.findElement(By.id("email_container")).getLocation().getY();
		System.out.println("X="+x+"px"+" Y="+y+"px");
		d.close();

	}

}
