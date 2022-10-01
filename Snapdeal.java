package wee4Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.mongodb.MapReduceCommand.OutputType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		Assignment 3:SnapDeal
//		============
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
//		1. Launch https://www.snapdeal.com/	
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		2. Go to Mens Fashion
		WebElement Men = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(Men).perform();
//		3. Go to Sports Shoes
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		

//		4. Get the count of the sports shoes
		List<WebElement> count = driver.findElements(By.xpath("//span[@class='category-name category-count']"));
		for (int i = 0; i < count.size(); i++) {
			
			System.out.println(count.get(i).getText());
			
		}
		
//		5. Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
//		6. Sort by Low to High
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
//		7. Check if the items displayed are sorted correctly
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//ul[@class='sort-value']//li)[2]")).getText();
		System.out.println(text);
		if(text.contains("Low To High")) {
			System.out.println("sort by Low To High");
		}
		else {
			System.out.println("not Sorted");
		}
			
//		7. Check if the items displayed are sorted correctly
		
//		8.Select the price range (900-1200)
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='input-filter']")).clear();
		driver.findElement(By.xpath("//input[@class='input-filter']")).sendKeys("900");
		driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).sendKeys("1200");
		driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow btn')]")).click();
		
//		9.Filter with color yellow; 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Color_s-Yellow']")).click();
//		10 verify the all applied filters 
		String color = driver.findElement(By.xpath("//a[@data-value='Yellow']")).getText();
		System.out.println(color);
		String price = driver.findElement(By.xpath("//span[@class='lfloat product-price']")).getText();
		System.out.println(price);
		if(color.contains("Yellow") && (price.contains("Rs.900- Rs.1200"))) {
			System.out.println("all filters are applied");
		}
		else {
			System.out.println("not applied");
		}
//		11. Mouse Hover on first resulting Training shoes
		Thread.sleep(2000);
		WebElement shoes = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		Actions build=new Actions(driver);
		build.moveToElement(shoes).perform();
		Thread.sleep(2000);
//		12. click QuickView button
//		Set<String> window1 = driver.getWindowHandles();
//		List<String> list = new ArrayList<String>(window1);
//		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();
		//Set<String> windowHandles = driver.getWindowHandles();
		//List<String>=new
//		13. Print the cost and the discount percentage
		Thread.sleep(2000);
		String price1 = driver.findElement(By.xpath("//div[contains(@class,'product-price pdp-e-i-PAY-l')]//span[1]")).getText();
		System.out.println("cost -" +price1);
		String discount = driver.findElement(By.xpath("//span[text()='23% Off']")).getText();
		System.out.println("discount -" +discount);
//		14. Take the snapshot of the shoes.
		File source = driver.getScreenshotAs(org.openqa.selenium.OutputType.FILE);

		//create physical file
		File destination =new File("./snaps/screenshot.png");
		//copy the source
	FileUtils.copyFile(source, destination);
		
//		15. Close the current window
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
		
		
//		16. Close the main window
		Thread.sleep(2000);
		driver.quit();
		

	}

}
