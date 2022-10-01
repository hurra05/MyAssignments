package wee4Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//	2:Nykaa
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

//		1) Go to https://www.nykaa.com/
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		2) Mouseover on Brands and Search L'Oreal Paris
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brand).perform();

//		3) Click L'Oreal Paris
		driver.findElement(By.xpath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']"))
				.click();

//		4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		String title = driver.getTitle();
		System.out.println(title);

		// Thread.sleep(3000);
//		5) Click sort By and select customer top rated
		// WebElement drop = driver.findElement(By.className(" css-n0ptfk"));
		// Select source=new Select(drop);
		// source.selectByVisibleText("customer top rated");
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		Thread.sleep(2000);
//		6) Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//div[@id='first-filter']//div")).click();
		driver.findElement(By.xpath("(//div[@class=' css-b5p5ep'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();

//		7) Click->Concern->Color Protection
		driver.findElement(By.xpath("//div[@id='filters-strip']/div[1]/div[1]/div[5]/div[1]")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();

//		8)check whether the Filter is applied with Shampoo
		String text = driver.findElement(By.xpath("(//div[@class='css-19j3ean']//div)[2]")).getText();

		if (text.contains("Shampoo")) {
			System.out.println("Filter is applied");
		}

//		9) Click on L'Oreal Paris Colour Protect Shampoo

		driver.findElement(By.xpath("//div[contains(text(),'Oreal Paris Colour Protect Shampoo')]")).click();

//		10) GO to the new window and select size as 175ml
		Thread.sleep(3000);
		Set<String> window1 = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(window1);
		driver.switchTo().window(list.get(1));

		 WebElement size = driver.findElement(By.xpath("//select[@title='SIZE']"));
		 Select source= new Select(size);
		 source.selectByVisibleText("175ml");
		
		Thread.sleep(2000);
		
//		11) Print the MRP of the product
		String text2 = driver.findElement(By.xpath("//div[@class='css-1d0jf8e']")).getText();
		System.out.println(text2);
//		12) Click on ADD to BAG
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
//		13) Go to Shopping Bag 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']//span")).click();
		
//		14) Print the Grand Total amount
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		String Grandtotal = driver.findElement(By.xpath("//div[@class='name medium-strong']")).getText();
		System.out.println(Grandtotal);
	
//		15) Click Proceed
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
//		16) Click on Continue as Guest
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
//		17) Check if this grand total is the same in step 14
		 String check = driver.findElement(By.xpath("//div[contains(@class,'payment-details-tbl grand-total-cell')]//div[1]")).getText();
		if(Grandtotal.equals(check)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
//		18) Close all window
		Thread.sleep(2000);
		driver.quit();
	}
	

}
