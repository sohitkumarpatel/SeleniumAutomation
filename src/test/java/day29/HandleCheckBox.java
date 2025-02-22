package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// 1 select the checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='sunday']"));
		System.out.println("Befor the selection:" + checkbox.isSelected());
		driver.findElement(By.xpath("//input[@id='sunday']")).click(); // select checkbox
		System.out.println("After the selection:" + checkbox.isSelected());

		// 2 Capture all checkbox
		List<WebElement> checkboxlist = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("lits of checkbox:" + checkboxlist.size()); // 7

		// Selecting all checkboxes
		for (int i = 0; i < checkboxlist.size(); i++) {
			checkboxlist.get(i).click();
		}
		for (WebElement checkboxes : checkboxlist) {
			checkboxes.click();
		}

		// Select last three checkboxes
		// Total number of checkboxes - how many checkbox do you want to select =
		// Starting index
		// 7-3=4
		for (int i = 4; i < checkboxlist.size(); i++) {
			checkboxlist.get(i).click();
		}

		// select first 3
		for (int i = 3; i < checkboxlist.size(); i++) {
			checkboxlist.get(i).click();
		}

		// Select the Xpath by its value->use two xapth one for checkbox and other for
		// value

		// Select ans Unselect Checkbox

		for (WebElement checkboxes : checkboxlist) {
			if (checkboxes.isSelected()) {
				checkboxes.click(); // unselect
			} else {
				checkboxes.click(); // select
			}
		}
		// Select specific checkbox randomly

		for (int i = 0; i < checkboxlist.size(); i++) {
			if (i == 1 || i == 4 || i == 5) {
				checkboxlist.get(i).click();
			}
		}
		
		//using switch statements
		String weekname="Monday";
		switch(weekname) {
		case "Sunday": driver.findElement(By.xpath("//input[@id='sunday']")).click();
						break;
		case "Monday": driver.findElement(By.xpath("//input[@id='monday']")).click();
						break;
		case "Tuesday": driver.findElement(By.xpath("//input[@id='tuesday']")).click();
						break;
		case "Wednesday": driver.findElement(By.xpath("//input[@id='wednesday']")).click();
						break;
		case "Thrusday": driver.findElement(By.xpath("//input[@id='thrusday']")).click();
						break;
		case "Friday": driver.findElement(By.xpath("//input[@id='friday']")).click();
						break;
		case "Saturday": driver.findElement(By.xpath("//input[@id='saturday']")).click();
						break;
		default: System.out.println("You Entered the Invalid week name ");	
		
		}
		
		// Exercise -> https://practice.expandtesting.com/checkboxes

	}

}
