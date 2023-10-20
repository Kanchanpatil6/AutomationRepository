package methodofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrenturl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/user/submit_tt.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		

	}

}
