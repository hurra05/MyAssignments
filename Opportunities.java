package friday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opportunities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//setup the path
		WebDriverManager.chromedriver().setup();
		
		//disable notifications
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		
		//manage ur window
		driver.manage().window().maximize();
		
		//add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Login to https://login.salesforce.com
		driver.get("https://login.salesforce.com");
		
		//enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		
		//enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
		
		//click login button
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(3000);
		
		//Click on toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		//Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		//Click on Opportunity tab
		WebElement click1 = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();",click1);
		//Click on New button
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys("Hurra");
			Thread.sleep(2000);
		//Enter 'your name' as account name
		 driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']")).sendKeys("Hurra");
		 driver.findElement(By.xpath("//strong[text()='Hurra']")).click();
		//driver.executeScript("arguments[0].click;", Hurra);
		//choose close date
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='14']")).click();
		
		//click stage(Needs Analysis)
		WebElement Needs_Analysis = driver.findElement(By.xpath("//button[@data-value='--None--']"));
		driver.executeScript("arguments[0].click();",Needs_Analysis );
		
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		//click save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		
									
		
				
		//verify message
		String Toast = driver.findElement(By.xpath("//div[@data-aura-class='forceToastMessage'][1]")).getAttribute("text");
		System.out.println(Toast);
		if(Toast.contains("Hurra")) {
			System.out.println("verified");
		}
			else {
				System.out.println("not verified");
			}
		
		// Close the Browser
		driver.quit();
		
		}
				
		
	

	}


