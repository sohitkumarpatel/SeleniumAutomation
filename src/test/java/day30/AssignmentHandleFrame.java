package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentHandleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame5
		//WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		//driver.switchTo().frame(frame5);
		//driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Inside Frame 5");
		
		// Switch to iframe
		
		//driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();

	}

}
