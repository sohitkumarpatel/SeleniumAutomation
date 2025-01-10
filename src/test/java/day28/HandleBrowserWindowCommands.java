package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindowCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//Before switching
		//System.out.println(driver.getCurrentUrl());
		
		Set<String>windowID=driver.getWindowHandles();
		
		//Approach1
		/*
		List<String> windowList=new ArrayList(windowID);
		String paraentID=windowList.get(0);
		String childID=windowList.get(1);
		
		
		//switch to child window
		driver.switchTo().window(childID);
		System.out.println(driver.getCurrentUrl());
		
		//switch to child window
		driver.switchTo().window(paraentID);
		System.out.println(driver.getCurrentUrl());
		*/
		
		//Apporach2
		for(String winID:windowID) {
			String title=driver.switchTo().window(winID).getTitle();
			
			if(title.equals("OrangeHRM")) {
			System.out.println(driver.getCurrentUrl());
			}
		}
		
		driver.quit();
			
	}

}
