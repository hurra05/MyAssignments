package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserName")).sendKeys("demosalemanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativesubmit")).click();
		//get text
				String text =driver.findElement(By.tagName("h2")).getText();
				//print the tag name
				System.out.println(text);
				//verify by title
				String title=driver.getTitle();//cntrl+2+l//leaftaps-testleaf automation platform
				System.out.println(title);
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Creat Lead")).click();
				driver.findElement(By.id("creat lead form_companyName")).sendKeys("Test leaf");
				driver.findElement(By.id("creat lead form_firstName")).sendKeys("Khatijatul");
				driver.findElement(By.id("creat lead form_lastName")).sendKeys("Hurra");
				driver.findElement(By.name("departmentName")).sendKeys("Environmental Engineering");
				driver.findElement(By.name("discription")).sendKeys("Hurra completed the assignment");
				driver.findElement(By.id("creatLeadForm-primary email")).sendKeys("khatejatulhurra12@gamil.com");
				driver.findElement(By.className("smallsubmit")).click();
		driver.findElement(By.linkText("Duplicate button")).click();
		driver.findElement(By.id("creatlaeadform_comoany Name")).clear();
		driver.findElement(By.id("Enter new company Name")).sendKeys("Accenture");
		driver.findElement(By.id("creat lead form_firstName")).clear();
		driver.findElement(By.id("enter new name")).sendKeys("hurra");
		driver.findElement(By.className("smallsubmit")).click();
		String title2=driver.getTitle();
		System.out.println(title2);
		
		
	

		
		
	}

}
