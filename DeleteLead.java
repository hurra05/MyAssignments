package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.linkText("http://leaftaps.com/crmsfa/control/main?externalLoginKey=EL338861162424")).click();
		driver.findElement(By.xpath("//div[@for='crmsfa']//a[1]")).click();
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("9");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9620664962");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String Lead-id=driver.findElement(By.xpath("//a[text()='11017']")).getText();
		//String id=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
		//System.out.println(id);
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("11017");	
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        String display = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
        System.out.println(display);
        driver.quit();
		
		
		
		
		
		
	}

}
