package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("__disable-notification");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/flights/en-in/?gclid=CjwKCAjwsKqoBhBPEiwALrrqiFsQ7Er25f-Bri3AKVWv7kzsRBV7AkF_CosqOCykWg4rgLVLlJH9VhoC3oMQAvD_BwE&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=CjwKCAjwsKqoBhBPEiwALrrqiFsQ7Er25f-Bri3AKVWv7kzsRBV7AkF_CosqOCykWg4rgLVLlJH9VhoC3oMQAvD_BwE:G:s&s_kwcid=AL!596!3!665237401807!p!!g!!air%20vistara&s_kwcid=AL!596!3!665237401807!p!!g!!air+vistara&gad=1");
		driver.findElement(By.id("customiseBtn")).click();
		
	}
}