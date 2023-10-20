package assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted')]")).sendKeys("pune");
		
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted')]")).sendKeys("mumbai");
		
		driver.findElement(By.xpath("input[contains(@class,'ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'fa fa-window-close pull-right loginCloseBtn ng-tns-c19-13')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'27')]")).click();
		driver.findElement(By.xpath("//li[contains(@class,'ui-dropdown-item ui-corner-all ui-state-highlight')]")).click();
		//driver.findElement(By.xpath(""))
		
	
		
		

	}

}
