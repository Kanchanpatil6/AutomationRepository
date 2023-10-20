package methodofWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1:81/login.do;jsessionid=2jkhef46au2jf");
		
		//user
		WebElement usertext = driver.findElement(By.xpath("//input[@class='textField']"));
		usertext.sendKeys("admin");
		
		//passward
		WebElement passward = driver.findElement(By.xpath("//input[@name='pwd']"));
        passward.sendKeys("admin2001");
        
        
        //click on checkbox
        driver.findElement(By.id("keepLoggedInCheckBox")).click();
        //click on login button   
        driver.findElement(By.xpath("//a[@id='loginButton']")).click();
          

	}

}
