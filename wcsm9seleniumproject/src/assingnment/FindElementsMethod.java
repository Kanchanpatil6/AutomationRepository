package assingnment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("_30XB9F")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("Pke_EE")).sendKeys("Laptop");
		driver.findElement(By.className("_2iLD__")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao']")).click();
		driver.findElement(By.xpath("//div[text()='HP' and (@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Processor Brand')]")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i5')]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Operating System')]")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Windows 11')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='4★ & above')]")).click();
		Thread.sleep(2000);
		
		 List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']"));
		 List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
				for(int i=0;i<allLaptops.size();i++)
				{
					String Laptops=allLaptops.get(i).getText();
					Thread.sleep(2000);
					for(int j=1;j<=i;j++)
					{
						String price =allPrices.get(j).getText();
						Thread.sleep(2000);
						System.out.println(Laptops+"  :"+price);
					}
				}
						
					}
				
		
		
		
		

	}


