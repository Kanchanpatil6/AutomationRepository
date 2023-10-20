package methodofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closemethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//maximize the page
		driver.manage().window().maximize();
		//launch the url
		driver.get("https://www.flipkart.com/");
		//delay the 2 sec
		Thread.sleep(2000);
		//click on new to flipkart link 
		driver.findElement(By.partialLinkText("New to Flipkart? Create an account")).click();
		//delay of 2 sec
		Thread.sleep(2000);
		//close the chrome
        driver.close();
	}

}
