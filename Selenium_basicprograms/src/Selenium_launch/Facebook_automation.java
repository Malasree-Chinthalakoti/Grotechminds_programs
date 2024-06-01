package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("malasrirekha@gmail.com");
driver.findElement(By.id("pass")).sendKeys("malasri123");
driver.findElement(By.name("login")).click();
	}

}
