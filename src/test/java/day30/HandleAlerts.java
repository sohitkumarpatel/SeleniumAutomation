package day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//1). Normal Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//Thread.sleep(2000);
		//Alert myalert=driver.switchTo().alert();
		//myalert.accept();
		driver.switchTo().alert().accept();
		
		//2). Confirmation Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept(); //close alert window using OK button
		driver.switchTo().alert().dismiss(); //close alert window using Cancel button
		
		//3). Prompt alert - Input box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myAlert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Text message on Alert box:"+myAlert.getText()); //I am a JS prompt
		myAlert.sendKeys("John"); 
		myAlert.accept();
		
		String res=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		if(res.contains("John")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		

	}

}
