package day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String>windowID=driver.getWindowHandles();
		
		for(String winID:windowID) {
			String title=driver.switchTo().window(winID).getTitle();
			System.out.println(title);
			
			if(title.equals("Human Resources Management Software | OrangeHRM")|| title.equals("Other title")) {
			driver.close();
			}
		}

	}

}
