package day31;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebElementTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().minimize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1. Find total number of row
		int rowsize=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //Multiple table on WebPage
		//int rowsize=driver.findElements(By.tagName("tr")).size(); //single table on WebPage
		System.out.println("row size is:"+rowsize); //7
		
		//2.Find total number of cols
		int colsize=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Cols size is:"+colsize); //4
		
		//3. Read the data from specific row and col
		String autherName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[2]")).getText();
		System.out.println("Auther name :"+autherName); // Author-Animesh
		
		//4. Read the data from all the rows and cols
		for(int r=2;r<=rowsize;r++) {
			for(int col=1;col<=colsize;col++) {
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+col+"]")).getText();
				System.out.print(value+"\t");
			}	
			System.out.println();
		}
		
		//5. Print book name whoes author is Mukash
		System.out.println("BookName" +"\t" +"Subject");
		for(int r=2;r<=rowsize;r++) {
			String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			//System.out.println(authorName);
			if(authorName.equalsIgnoreCase("Mukesh")) {
				String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				String subjectName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[3]")).getText();
				
				System.out.println(bookName +"\t"+ subjectName);
			}
			
		}
		
		//6. Find total price of the all books
		int total=0;
		for(int r=2;r<=rowsize;r++) {
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(price);
		}
		System.out.println(total);
		
		//7. Find the lowest price of the Subject
		
		//capture prices then store in array
		
		/*String pricesArr[]=new String[rowsize];   //0-4
		
		for(int r=2;r<=rowsize;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			pricesArr[r-2]=price; //adding price into array
		}
		
		//Sort prices then find lower price value
		
		for(String arrvalue:pricesArr)
		{
			System.out.println(arrvalue);
		}
		
		Arrays.sort(pricesArr); // this will able to sort strings. so no need to convert to number
		String lowestPrice=pricesArr[0];
		System.out.println("Lower price:"+lowestPrice);
		*/
		
		List<Double> priceList = new ArrayList<>();

        // Capture prices
        for (int r = 2; r <= rowsize; r++) { // Assuming row 1 is header
            WebElement priceElement = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]"));
            String price = priceElement.getText();

            if (!price.isEmpty()) { // Only add valid prices
                priceList.add(Double.parseDouble(price));
            } else {
                System.out.println("Skipping empty price at row " + r);
            }
        }

        // If no valid prices were found
        if (priceList.isEmpty()) {
            System.out.println("No valid prices found!");
            return;
        }

        // Convert List to Array and Sort Numerically
        Double[] numPrices = priceList.toArray(new Double[0]);
        Arrays.sort(numPrices);

        // Lowest price
        System.out.println("Lowest price: " + numPrices[0]);
		driver.close();
		
	}

}
