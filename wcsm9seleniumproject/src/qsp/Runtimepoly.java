package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runtimepoly {
	
    static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the browser value");
       String browservalue=sc.next();
       
       if(browservalue.equalsIgnoreCase("chrome"))
       {
    	   driver=new ChromeDriver();
    	   driver.manage().window().maximize();
    	   Thread.sleep(2000);
    	   driver.close();
       }
       else if(browservalue.equalsIgnoreCase("firefox"))
       {    
    	    driver=new FirefoxDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.close();
	   }
       else if(browservalue.equals("Edge"))
       {
    	   driver=new EdgeDriver();
    	   driver.manage().window().maximize();
    	   Thread.sleep(2000);
    	   driver.close();
       }
       else {
    	   System.out.println("please enter valid url");
       }
}
}