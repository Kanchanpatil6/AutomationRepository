package methodofwebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.indexeddb.model.Key;

public class SwitchTomethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		

	}

}
