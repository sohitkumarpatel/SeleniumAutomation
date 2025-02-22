package day30;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01HandleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://mypage.rediff.com/login/dologin
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("//https://mypage.rediff.com/login/dologin");
		driver.manage().window().maximize();
	}
	

}
