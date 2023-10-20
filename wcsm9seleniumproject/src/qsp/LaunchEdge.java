package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new EdgeDriver();
        System.out.println("microsoftEdge is open");
        Thread.sleep(2000);
        driver.close();
	}

}
