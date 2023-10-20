package methodofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetpageSource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
		Thread.sleep(2000);
		String loginpagesourcecode=driver.getPageSource();
		System.out.println(loginpagesourcecode);
		driver.close();

	}

}
