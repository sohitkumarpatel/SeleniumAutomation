package day23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		//id
		
		//WebElement logo=driver.findElement(By.id("logo"));
		//boolean status =logo.isDisplayed();
		//boolean status =driver.findElement(By.id("logo")).isDisplayed(); //single step
		//System.out.println("Display Status:"+status);
		
		
		//name
		
		//driver.findElement(By.name("search")).sendKeys("MacBook"); //single step
		//WebElement searchBox=driver.findElement(By.name("search"));
		//searchBox.sendKeys("laptop");
		
		//linkText & partialLinkText
		
		//driver.findElement(By.linkText("Tablets")).click(); //linkText
		//driver.findElement(By.partialLinkText("Laptops & Note")).click(); //partialLinkText
		//driver.findElement(By.linkText("Contact Us")).click(); //ElementClickInterceptedException - resolve by JavaScriptExecutor
		
		
		//TagName
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		//className
	
		//List<WebElement> headerlinks =driver.findElements(By.className("list-inline-item"));
		//System.out.println(headerlinks.size());
		
		
		//CSS selector
		//XPath
		
	}

}
