package methodofWebelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.google.com/");
		
		driver.switchTo().activeElement().sendKeys("iphone");
		
		List<WebElement> allphone = driver.findElements(By.xpath("//textarea[@name='q']"));
		Thread.sleep(2000);
		
		for(WebElement op:allphone)
		{
			String options= op.getText();
			Thread.sleep(2000);
			System.out.println(options);
			
		}
		


	}

}
