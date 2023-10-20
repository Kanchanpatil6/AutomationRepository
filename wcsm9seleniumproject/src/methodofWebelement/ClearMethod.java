package methodofWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1:81/login.do;jsessionid=2jkhef46au2jf");
		WebElement usertext = driver.findElement(By.xpath("//input[@class='textField']"));
		usertext.sendKeys("admin");
		Thread.sleep(2000);
		
		
		WebElement passward = driver.findElement(By.xpath("//input[@name='pwd']"));
            passward.sendKeys("admin2001");
            Thread.sleep(2000);
            
        usertext.clear();
        passward.clear();
            
       

	}

}
