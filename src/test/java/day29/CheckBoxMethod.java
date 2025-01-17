package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//WebElement chackbox=
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		//System.out.println("Befor the selection"+checkbox.isSelected());
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		//System.out.println("After the selection"+checkbox.isSelected());
		
		
		
		
		

	}

}
