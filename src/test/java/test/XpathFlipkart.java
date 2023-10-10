package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathFlipkart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement account=driver.findElement(By.xpath("//a[@title=\"Sign in\"]"));
		account.click();
		
		WebElement id=driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		
		id.sendKeys("986543210");
		
}
}