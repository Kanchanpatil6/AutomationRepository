package assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoXpathUniqueAttri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='Hyundaix']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='combobox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='radio2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='alert1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='prompt']")).click();
		Thread.sleep(2000);
	   	
	}

}
