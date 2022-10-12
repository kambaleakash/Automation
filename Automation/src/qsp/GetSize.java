package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login/");
		int height=d.findElement(By.id("email")).getSize().getHeight();
		int width=d.findElement(By.id("email")).getSize().getWidth();
		d.close();
		
		System.out.println("Height= "+height+" Width= "+width);

	}

}
