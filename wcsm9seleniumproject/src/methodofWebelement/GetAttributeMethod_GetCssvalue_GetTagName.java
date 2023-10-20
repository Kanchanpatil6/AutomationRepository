package methodofWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class GetAttributeMethod_GetCssvalue_GetTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement usertxt = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		//get the attribute value
		String attributevalue=usertxt.getAttribute("class");
		System.out.println(attributevalue);
		
		//get the case proper
		//string css value property of username text i.e color
		String Cssvalue=usertxt.getCssValue("width");
		System.out.println(Cssvalue);
		
		//get the tagname of username text box
		String tag=usertxt.getTagName();
		System.out.println(tag);
		

	}

}
