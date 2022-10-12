package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		boolean result=d.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(result==true)
			System.out.println("Check box is selected and fail");
		else
			System.out.println("Check box is not selected and pass");
		d.close();
			

	}

}
