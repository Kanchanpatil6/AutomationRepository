package methodofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//handle the properties og webdriver
		//maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//minimize
		driver.manage().window().minimize();
		//fullscreen
		driver.manage().window().fullscreen();
		//setsize
	     Dimension targetsize = new Dimension(350, 4500);
	     driver.manage().window().setSize(targetsize);
	     Thread.sleep(2000);
	     //setposition
	     Point targetposition = new Point(450, 2500);
         driver.manage().window().setPosition(targetposition);
         
         driver.close();
	}

}
