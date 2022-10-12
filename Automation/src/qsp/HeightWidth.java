package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("http://demo.opensourcebilling.org/en/users/sign_in");
		int height1=d.findElement(By.id("email")).getSize().getHeight();
		int width1=d.findElement(By.id("email")).getSize().getWidth();
		
		int height2=d.findElement(By.id("password")).getSize().getHeight();
		int width2=d.findElement(By.id("password")).getSize().getWidth();
		
		d.close();
		
		if(height1==height2 && width1==width2)
			System.out.println("Both Email and Password textbox size are same and pass");
		else
			System.out.println("Both Email and Password textbox size are not same and fail");

	}

}
