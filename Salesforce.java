package friday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		
		WebElement clc = driver.findElement(By.xpath("//a[@title='Accounts']//span[1]"));
		driver.executeScript("arguments[0].click();",clc);
		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Hurra");
		WebElement Public = driver.findElement(By.xpath("(//button[@data-value='--None--'])[3]"));
		driver.executeScript("arguments[0].click();",Public);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		String attribute= driver.findElement(By.xpath("//div[@role='alertdialog']")).getAttribute("title");
		System.out.println(attribute);
	
		
		
		

	}

}
