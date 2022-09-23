package assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Step 2: Instantiate the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Loads a new web page in the current browser window
		// Maximize the screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		// In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("bags", Keys.ENTER);
		// To the left of the screen under " Gender" click the "Men"
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		// Under "Category" click "fashion bags"
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		// Print the count of the items Found.
		Thread.sleep(1000);
		
		List<WebElement> list1 = driver.findElements(By.className("length"));
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i).getText());
		}
		System.out.println(list1.size());
		
		  //Get the list of brand of the products displayed in the page and print the list.
		   List<WebElement> list =  driver.findElements(By.xpath("//div[@class='brand']")); 
		  for (int j = 0; j < list.size(); j++) { 
			  System.out.println(list.get(j).getText()); 
			  }
	  System.out.println(list.size());
		 
		/*List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		for (int i = 0; i < bagBrandList.size(); i++) {
			System.out.println(bagBrandList.get(i).getText());

		}
		System.out.println(bagBrandList.size());
		//Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		for (int i = 0; i < bagNameList.size(); i++) {
			
			System.out.println(bagNameList.get(i).getText());
		}
		System.out.println(bagNameList.size());	
		*/
	}

}
