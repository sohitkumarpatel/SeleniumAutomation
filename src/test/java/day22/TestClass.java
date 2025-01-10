package day22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String gettitle=driver.getTitle();
		if(gettitle.equals("Your Store")) {
			System.out.println("Testcase Pass !!");
		}
		else {
			System.out.println("Testcase Failed !!");
		}
	}

}
