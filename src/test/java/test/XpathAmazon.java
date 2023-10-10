package test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAmazon {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement account=driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		account.click();
		
		WebElement create=driver.findElement(By.xpath("//a[@id=\"createAccountSubmit\"]"));
		create.click();
		
		WebElement name=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		name.sendKeys("wolverine");
		
		WebElement phone=driver.findElement(By.xpath("//input[@type=\"tel\"]"));
		phone.sendKeys("9876543210");
		
		WebElement email=driver.findElement(By.xpath("//input[@type=\"email\"]"));
		email.sendKeys("9876543210");
		
		WebElement pass=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		pass.sendKeys("9876543210");

}
}
