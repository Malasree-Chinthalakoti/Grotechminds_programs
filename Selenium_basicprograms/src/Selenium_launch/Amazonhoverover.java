package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonhoverover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement accountsandlist=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	
	
		
		Actions a=new Actions(driver);
		a.moveToElement(accountsandlist).perform();
		WebElement signin=driver.findElement(By.linkText("Sign in"));
		signin.click();
		WebElement username=driver.findElement(By.id("ap_email"));
		username.sendKeys("malasrirekha@gmail.com");
		WebElement newaccount=driver.findElement(By.id("createAccountSubmit"));
		newaccount.click();
		WebElement customername=driver.findElement(By.name("customerName"));
		customername.sendKeys("malasri");
		WebElement number=driver.findElement(By.id("ap_phone_number"));
		number.sendKeys("9502489669");
		WebElement password=driver.findElement(By.id("ap_password"));
		password.sendKeys("mala9669");
		WebElement verify=driver.findElement(By.id("continue"));
		verify.click();
	}

}
