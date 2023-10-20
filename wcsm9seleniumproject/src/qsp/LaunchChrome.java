package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        System.out.println("chrome is open");
        Thread.sleep(2000);
        driver.close();
        System.out.println("chrome is closed");
	}

}
