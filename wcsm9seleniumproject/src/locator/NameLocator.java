package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///G:/Desktop/Htmlcode/login.html");
		Thread.sleep(2000);
		driver.findElement(By.name("n1")).sendKeys("admin");
		driver.findElement(By.name("n2")).sendKeys("manager");

	}

}
