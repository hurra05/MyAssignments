package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Khatijatul");
		driver.findElement(By.name("lastname")).sendKeys("Hurra");
		driver.findElement(By.name("reg_email__")).sendKeys("khatejatulhurra12@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("khatejatulhurra12@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("facebook");
		WebElement Day = driver.findElement(By.id("day"));
		Select dd=new Select(Day);
		dd.selectByVisibleText("5");
		WebElement Month = driver.findElement(By.id("month"));
		Select dd1=new Select(Month);
		dd1.selectByVisibleText("Sep");
		WebElement Year = driver.findElement(By.id("year"));
			Select dd2=new Select(Year);
		dd2.selectByValue("1995");
		driver.findElement(By.name("sex")).click();
		
		
	
		
		

		
	}
	
}
