package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		int t1=d.findElement(By.id("username")).getLocation().getX();
		int t2=d.findElement(By.name("pwd")).getLocation().getX();
		d.close();
		System.out.println("t1="+t1+"px"+" t2="+t2+"px");
		if(t1==t2)
			System.out.println("Both UN and PWD textbox are properly alligned and pass");
		else
			System.out.println("Both UN and PWD textbox are not properly alligned and fail");

	}

}
