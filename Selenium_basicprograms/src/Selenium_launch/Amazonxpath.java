package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	WebElement search=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("shoe");
	search.sendKeys(Keys.ENTER);
	}

}
