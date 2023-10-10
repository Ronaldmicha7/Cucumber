package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathEmail {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/createaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement name=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		name.sendKeys("wolverine");
		
		WebElement name2=driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		name2.sendKeys("moon");
		
		WebElement next=driver.findElement(By.xpath("//span[@class=\"VfPpkd-vQzf8d\"]"));
		next.click();
		
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		month.click();
		
		WebElement date=driver.findElement(By.xpath("//input[@type=\"tel\"]"));
		date.sendKeys("07");
		
		

}
}