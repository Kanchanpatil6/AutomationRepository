package methodofWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetReact_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           
           driver.get("http://127.0.0.1:81/login.do;jsessionid=2t4qef5xi5gxj");
           
           WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
           
           //point the location of username text box
           Point loc=username.getLocation();
           
           int Xaxis=loc.getX();
           int Yaxis=loc.getY();
           
           System.out.println("location of username textbox:"+Xaxis+":"+Yaxis);
           
           
           //get the size of username text box
           Dimension size=username.getSize();
           
           int height=size.getHeight();
           int width=size.getWidth();
           System.out.println("username text box size is:"+height+":"+width);
           
           //getreact
            Rectangle rect = username.getRect();
          // username.getRect(rect);
            System.out.println(rect.getX());
           System.out.println(rect.getY());
           
           driver.close();
	}

}
