package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathRedbus {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		WebElement account=driver.findElement(By.xpath("(//span[@class=\"name_rb_secondary_item\"])[2]"));
		
		account.click();
		
		WebElement login=driver.findElement(By.xpath("(//span[@class=\"header_dropdown_item_name\"])[5]"));
		
		login.click();
		
		WebElement id=driver.findElement(By.xpath("//input[@class=\"IP\"]"));
		id.sendKeys("9876543210");

}

}
