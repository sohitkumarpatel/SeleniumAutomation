package day30;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncoginitoMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options=new ChromeOptions();
		
		//open incognito mode and disable-infobars
		options.addArguments("incognito");
		//options.addArguments("--enable-automation");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.selenium.dev/documentation/webdriver/drivers/options/");
		
		
		
		//driver.close();
	}

}
