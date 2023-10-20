package assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://affiliate.flipkart.com/login");
		driver.findElement(By.id("id")).sendKeys("chaudharykanchan622@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("id")).sendKeys("12345678");
	}

}
