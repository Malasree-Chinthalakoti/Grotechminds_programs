package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_an_av {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.in");
		driver.manage().window().maximize();
	WebElement search=	driver.findElement(By.cssSelector("[name='q']"));
	search.sendKeys("india");
	}

}
