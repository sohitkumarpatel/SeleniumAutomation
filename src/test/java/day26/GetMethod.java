package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		// Get Method - we can access these method through the WebDriver instance
		
		//get(url) - open the URL on the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//getTitle() - return the title of the page
		
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() - returns URL of the page
		
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource() - returns source code of the page		
		
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle()- return ID of the single browser window
		
		//String webwindow=driver.getWindowHandle();
		//System.out.println("Window id-"+webwindow); //4CFBF41E440BA2C49C1AF4971B671C98
													//3CB902D87B902C7050DFD4687FBE7C15
		
		//getWindowHandles() - return IDs of the multiple browser window
		
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		Set<String>windowid=driver.getWindowHandles();
		System.out.println("Window ID-"+windowid); //[60B3AD11914762AD67753A41D68F9843, 75C8F7DB641FF7656BF077A66A5D9407]
		
		
		
		
	}

}
