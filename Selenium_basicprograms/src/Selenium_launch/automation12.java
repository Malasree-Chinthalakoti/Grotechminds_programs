package Selenium_launch;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com");
driver.findElement(By.name("q")).sendKeys("amazon.com");
driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		}

}
