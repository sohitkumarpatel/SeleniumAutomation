package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement SelectDropDownEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select dropCountry=new Select(SelectDropDownEle);
		
		//Select Options from DropDown
		
		//dropCountry.selectByVisibleText("France");
		//dropCountry.selectByValue("japan");
		dropCountry.selectByIndex(3);
		
		// Capture the Option class from dropdown
		List<WebElement>options=dropCountry.getOptions();
		System.out.println("Number of Options in Drop Down:"+options.size());
		//printing the Options
		for(int i=0;i<options.size();i++) {
			System.out.print(options.get(i).getText()+",");
			
		}
		//using inhance for loop
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
	}

}
