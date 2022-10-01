package wee4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/sortable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		WebElement findElement1 = driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
		WebElement findElement2 = driver.findElement(By.xpath("//ul[@id='sortable']/li[2]"));
		WebElement findElement3 = driver.findElement(By.xpath("//ul[@id='sortable']/li[3]"));
		
		Actions builder=new Actions(driver);
		builder.clickAndHold(findElement1).moveToElement(findElement3).release(findElement1).perform();
		
		

			
			
			
			
	}

}
