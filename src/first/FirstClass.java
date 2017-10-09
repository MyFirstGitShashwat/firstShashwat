package first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
	
	
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Resources//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ENTER);
		driver.close();
		
		
		
		
		
		
	}

}
