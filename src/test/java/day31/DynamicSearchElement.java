package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSearchElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*driver.get("http://google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		System.out.println(list.size());
		
		for(WebElement items:list) {
			if(items.getText().equals("selenium")) {
				System.out.println(items.getText());
				items.click();
				break;
			}
		}
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equals("selenium")) {
				System.out.println(items.getText());
				list.get(i).click();
				break;
			}
		}
		*/
		
		driver.get("https://www.bjs.com/");
//		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='search-wrap']//input[@type='search']")).sendKeys("water");
		
		List<WebElement> lists=driver.findElements(By.xpath("//div[@class='StyledCategorySearchSuggestionstyle__StyledCategorySearchSuggestion-sc-10i2nc1-0 cVSmGZ']//div[@class='list list-group']//b"));
		
		System.out.println(lists.size());
		
		for(WebElement items:lists) {
			if(items.getText().equals("spring water")) {
				System.out.println(items.getText());
				Thread.sleep(1000);
				items.click();
				break;
			}
		}
		
		
	}

}
