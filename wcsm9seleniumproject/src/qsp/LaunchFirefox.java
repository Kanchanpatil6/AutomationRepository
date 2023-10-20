package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		System.out.println("firefox is open");
		Thread.sleep(2000);
		driver.close();
		System.out.println("firefox is close");

	}

}
