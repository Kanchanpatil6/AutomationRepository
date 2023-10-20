package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTextFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    driver.get("https://www.flipkart.com/search?q=mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='APPLE']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[.='4★ & above']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='256 GB & Above']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='4000 - 4999 mAh']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='6.4 inch & Above']")).click();
	   

	}

}
