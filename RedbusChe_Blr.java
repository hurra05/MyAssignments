package marathon2;

import java.time.Duration;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.runtime.model.PropertyPreview.Type;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedbusChe_Blr {

	public static void main(String[] args) throws InterruptedException {
	
//		Testcase 2 (RedBus)
//		01) Launch Firefox / Chrome
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		02) Load https://www.redbus.in/
		driver.get("https://www.redbus.in/");
//		03) Type "Chennai" in the FROM text box 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='db']")).sendKeys("chennai",Keys.ENTER);
//		hint: Sendkeys(Keys.ENTER)
		Thread.sleep(2000);
//		04) Type "Bangalore" in the TO text box
		driver.findElement(By.xpath("(//input[@class='db'])[2]")).sendKeys("Bangalore",Keys.ENTER);
		Thread.sleep(2000);
//		05) Select tomorrow's date in the Date field
		driver.findElement(By.xpath("//td[text()='7']")).click();
//		06) Click Search Buses
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
//		07) Print the number of buses shown as results (104 Buses found)
		String print = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		System.out.println(print);
//		08) Choose SLEEPER in the left menu 
		driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
//		09) Print the name of the second resulting bus
		Thread.sleep(2000);
		String print2 = driver.findElement(By.xpath("(//div[text()='Hail Trip'])[2]")).getText();
		System.out.println(print2);
//		10) Click the VIEW SEATS of that bus
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
//		11) Take screenshot and close browser
		//driver.getScreenshotAs(output TYPE.FILE);
	}

}
