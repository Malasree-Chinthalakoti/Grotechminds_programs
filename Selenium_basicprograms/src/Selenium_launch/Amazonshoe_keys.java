package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonshoe_keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	WebElement search=	driver.findElement(By.id("nav_cs_fresh"));
	search.click();
	/*Actions a=new Actions(driver);
	a.moveToElement(search).perform();
	WebElement signin=	driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']"));
	signin.click();
	WebElement username=	driver.findElement(By.xpath("//input[@type='email']"));
	username.sendKeys("malasrirekha@gmail.com");
	WebElement Continue=	driver.findElement(By.xpath("//span[@id='continue']"));
	Continue.click();
	WebElement password=	driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("9502489669");
	WebElement login=	driver.findElement(By.xpath("//span[@id='auth-signin-button']"));
	login.click();*/
	}

}
