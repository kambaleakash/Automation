package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAllign {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login/");
		d.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		int r1=d.findElement(By.xpath("//label[text()='Female']")).getLocation().getY();
		int r2=d.findElement(By.xpath("//label[text()='Male']")).getLocation().getY();
		int r3=d.findElement(By.xpath("//label[text()='Custom']")).getLocation().getY();
		
		System.out.println("R1="+r1+"px"+" R2="+r2+"px"+" R3="+r3+"px");
		
		if(r1==r2 && r2==r3)
			System.out.println("All radio buttons are perfectly alligned and pass");
		else
			System.out.println("All radio buttons are not perfectly alligned and fail");
		
		d.close();
			
		
	}

}
