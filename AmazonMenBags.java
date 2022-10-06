package marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonMenBags {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Testcase 1 (Amazon)
//		===================
//		01) Launch Chome
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		02) Load https://www.amazon.in/
		driver.get("https://www.amazon.in/");
//		03) Type "Bags" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		//driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']")).click();
//		04) Choose the displayed item in the result with bags for boys
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='for boys']")).click();
//		05) Print the total number of results (like 30000)
		Thread.sleep(3000);
		String totalnumber = driver.findElement(By.xpath("//span[text()='1-48 of over 30,000 results for']")).getText();
		System.out.println(totalnumber);
//		    1-48 of over 30,000 results for "bags for boys"
//		06) Select the first 2 brands in the left menu
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::i)[3]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy')]//i)[3]")).click();
//		    (like American Tourister, Generic)
//		07) Confirm the results have got reduced like 5000 &30,000	 (use step 05 for compare)
		Thread.sleep(3000);
		String selected = driver.findElement(By.xpath("//span[text()='1-48 of over 5,000 results for']")).getText();
		System.out.println(selected);
		if(totalnumber== selected) {
			System.out.println("both bag counts are equal");
		}
		else {
			System.out.println("bag count is reduced");
			
		}
//		08) Choose New Arrivals (Sort)
		Thread.sleep(3000);
		driver.findElement(By.className("a-dropdown-prompt")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
//		09) Print the first resulting bag info (name, discounted price)
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='21 L Latest Trends Laptop Backpack Bag Light Weight Stylish for Boys and Girls (Black)']")).click();
		
		Set <String> windohandles=driver.getWindowHandles();
		
	ArrayList<String> list=new ArrayList<String>(windohandles);
	driver.switchTo().window(list.get(1));
	String name = driver.findElement(By.id("productTitle")).getText();
	System.out.println(name);
	String discountprice = driver.findElement(By.xpath("//div[@id='corePriceDisplay_desktop_feature_div']/div[1]/span[2]/span[2]/span[2]")).getText();
	System.out.println(discountprice);
		
	//	10) Take screenshot and close
		
		
		
	}

}