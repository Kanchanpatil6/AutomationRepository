package assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartOnXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[2]")).click();
		Thread.sleep(2000);
		
		

	}

}
