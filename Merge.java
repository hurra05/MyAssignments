package wee4Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Merge {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//div[@class='subSectionBlock']//a)[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list= new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
//		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("muhammad");
//		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		driver.findElement(By.xpath("(//a[text()='14209']")).click();
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("(//div[@class='subSectionBlock']//a)[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		ArrayList<String> list2= new ArrayList<String>(windowHandles2);
		driver.switchTo().window(list2.get(1));
		driver.findElement(By.xpath("//a[text()='14210']")).click();
		driver.switchTo().window(list2.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
