package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicWebTableElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().minimize();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		
		//1. Find rows of the table
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table table-striped']//tbody//tr"));
		int rowsize=rows.size();
		System.out.println("rows size is:"+rowsize);
		
		//2. Print all the rows of table with data
		for(int r=1;r<=rowsize;r++) {
			String names=driver.findElement(By.xpath("//table[@class='table table-striped']//tbody//tr["+r+"]")).getText();
			System.out.println(names);
		}
		
		//3.Compare it with value in the yellow label.
		for(int r=1;r<=rowsize;r++) {
			WebElement names1=driver.findElement(By.xpath("//table[@class='table table-striped']//tbody//tr["+r+"]//td[1]"));
			if(names1.getText().equals("Chrome")) {
				String cpuload=driver.findElement(By.xpath("//td[normalize-space()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();
				String value=driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
				//System.out.println(cpuload+"\t"+value);
				if(value.contains(cpuload)) {
					System.out.println("The CPU load are equcal");
				}else {
					System.out.println("The CPU load are Not equcal");
				}
				break;
			}
			
		}

	}

}
