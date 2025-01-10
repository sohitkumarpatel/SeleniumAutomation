package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id -->tag#id
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Test");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirt");
		
		
		//tag class -->tag.className -- Mostly use to locate group of element
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirt");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirt");
		
		
		//tag attribute -->tag[attribute='value']
		
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirt");
		//driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("T-shirt");
		
		
		//tag class attribute -->tag.classname[attribute='value'] -- To find the unique locator
		
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirt");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-shirt");
	}

}
