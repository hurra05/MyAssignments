package wee4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDrag {

		
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/draggable");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.switchTo().frame(0);
			WebElement target = driver.findElement(By.xpath("//p[text()='Drag me around']"));
	       //find the initial position
			System.out.println("initial" + target.getLocation());
		    Actions builder=new Actions(driver);
		    builder.dragAndDropBy(target, 20, 35).perform();
		    //verify
		    System.out.println("verify" +target.getLocation());
		
		
		
	
	
}
}
