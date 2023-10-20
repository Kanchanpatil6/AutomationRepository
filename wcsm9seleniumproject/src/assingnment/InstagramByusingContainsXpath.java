package assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramByusingContainsXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2Fdirect%2Finbox%2F%3F__coig_login%3D1");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("kanchan");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("patil@12");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
        Thread.sleep(2000);
	}

}
