package day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethod {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	
		// navigate().to()->Accept the URL in the String format and URL Object format
		// get()-> Accept the only String URL
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//URL Object format
		
		//URL myURL=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().to(myURL);
		
		//navigate back method
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); //https://demo.nopcommerce.com/
		
		
		//navigate to forward
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		//refresh the page
		driver.navigate().refresh();
		
		
		
		

	}

}
