package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//Conditional method - access these commands using WebElement 
		
		//Return the boolean value(true/false)
		
		//isDisplay()--> we can check the display method of the element
		
		boolean status_diplay=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status_diplay);
		
		
		//isEnalbled()-->we can check the enabled or disabled element/operational elements
		
		boolean status_enabled=driver.findElement(By.id("small-searchterms")).isEnabled();
		System.out.println(status_enabled);
		
		
		//isSelected()--> we can use to check element is selected or not
		boolean status_selected=driver.findElement(By.name("pollanswers-1")).isSelected();
		System.out.println(status_selected);
	}

}
