package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='female']"));
		
		System.out.println("Before selection...");
		System.out.println("Select status of mail radio button..."+male_rd.isSelected());
		System.out.println("Select status of femail radio button..."+female_rd.isSelected());
		
		male_rd.click();
		
		System.out.println("After selection...");
		System.out.println("Select status of mail radio button..."+male_rd.isSelected());
		System.out.println("Select status of femail radio button..."+female_rd.isSelected());
		
	}
	// Exercise ->https://practice.expandtesting.com/radio-buttons

}
