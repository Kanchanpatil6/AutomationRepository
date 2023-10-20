package methodofWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLoginButton_GA_GT_GCMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		//get the attribute value
		String attributevalue=login.getAttribute("class");
		System.out.println(attributevalue);
		//get the case proper
		//string css value property of username text i.e color
		String Cssvalue=login.getCssValue("width");
		System.out.println(Cssvalue);
		
		//get the tagname of username text box
		String tag=login.getTagName();
		System.out.println(tag);

	}

}
