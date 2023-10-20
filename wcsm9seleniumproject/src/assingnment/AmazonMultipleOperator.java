package assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMultipleOperator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search Amazon')]")).sendKeys("mobile phones");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative' and (@id='a-autoid-0-announce')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_1' and (text()='Price: Low to High')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and (text()='Climate Pledge Friendly')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and (text()='CASETiFY')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Android' and (@class='a-size-base a-color-base')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Google - Pixel 3 with 64GB Memory Cell Phone (Unlocked) - Clearly White' and (@class='a-size-medium a-color-base a-text-normal')]")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
