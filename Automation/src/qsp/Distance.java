package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Distance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login/");
		d.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		int r1=d.findElement(By.xpath("//label[text()='Female']")).getLocation().getX();
		int r2=d.findElement(By.xpath("//label[text()='Male']")).getLocation().getX();
		int r3=d.findElement(By.xpath("//label[text()='Custom']")).getLocation().getX();
		
		int w1=d.findElement(By.xpath("//label[text()='Female']")).getSize().getWidth();
		int w2=d.findElement(By.xpath("//label[text()='Male']")).getSize().getWidth();
		int w3=d.findElement(By.xpath("//label[text()='Custom']")).getSize().getWidth();
		
		int d1=r1+w1;
		int d2=r2+w2;
		int d3=r3+w3;
		
		System.out.println(r2-d1);
		System.out.println(r3-d2);
		
		if((r2-d1)==(r3-d2))
			System.out.println("Distance between Radio buttons are same and pass");
		else
			System.out.println("Distance between Radio buttons are not same and fail");
		
		

	}

}
