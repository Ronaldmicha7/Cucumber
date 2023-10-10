package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocator {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		
		username.sendKeys("9876543210");
		
		WebElement password=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		
		password.sendKeys("12345");
		

		WebElement log=driver.findElement(By.name("//button[@name=\"login\"]"));
		
		log.click();
		
		
		
		
		
		
		
	}

}
