package methodofwebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetwindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		String parenthandle=driver.getWindowHandle();
		System.out.println("addres of parent browser or window + parenthandle");
		//click on open a pop window
		driver.findElement(By.partialLinkText("Open a popup window"));
		Set<String> allhandle=driver.getWindowHandles();
		//print the addres of browser use oreach loop
		for(String wh:allhandle)
		{
			if(parenthandle.equals(wh)) {
				System.out.println("addres of child window "+ wh);
			}
		
			else {
			System.out.println("addres ofparent window"+ wh);
		}
		}
		driver.quit();
	}
}

	



		// TODO Auto-generated method stub

	


