package assingnment2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthQuestionOmayo {

	public static void main(String[] args, Object parentaddr) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		String parentaddr1=driver.getWindowHandle();
		
		driver.findElement(By.xpath("/a[text()='Open a popup window'")).click();
		Thread.sleep(2000);
		Set<String>allHandles=driver.getWindowHandles();
		for(String wh:allHandles)
		{
			
			if(!parentaddr1.equals(wh)) {
				TargetLocator switchTo=driver.switchTo();
				Thread.sleep(2000);
				switchTo.window(wh).close();
				
				//how to close only child browser
			}
		}

	}

}
