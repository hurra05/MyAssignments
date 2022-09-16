package friday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Creat_Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        //1 Launch the browser
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
	    //	2) Click Login
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(2000);//Click on toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		//Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(1000);
		//	6) Type task and select task
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("task");
		driver.findElement(By.xpath("//mark[text()='Task']")).click();
		
        //7) Click New Task under dropdown icon
		driver.findElement(By.xpath("//a[@title='Show one more action']")).click();
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[@class='uiMenuItem']//a[1]")).click();
		//driver.executeScript("arguments[0].click();",New_task);
//	6) Enter subject as "Bootcamp "  
		 driver.findElement(By.xpath("//label[text()='Subject']/following::input")).sendKeys("Bootcamp");
//	8) Select status as 'Waiting on someone else'
		 driver.findElement(By.xpath("//a[@class='select']")).click();
		 WebElement Waiting = driver.findElement(By.xpath("//a[@title='Waiting on someone else']"));
		 driver.executeScript("arguments[0].click();",Waiting);
		 driver.findElement(By.xpath("//button[@title='Save']")).click();
//	9) Save and verify the 'Task created' message
		 String Toast = driver.findElement(By.xpath("//div[@data-aura-class='forceToastMessage']")).getAttribute("Toast");
		 System.out.println("Toast");
		 if(Toast.contains("Bootcamp")) {
				System.out.println("verified");
			}
				else {
					System.out.println("not verified");
				}
			
	// Close the Browser
			driver.quit();
		
		 }
	}


