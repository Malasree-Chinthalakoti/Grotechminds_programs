package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_enable_disable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com");
WebElement search=driver.findElement(By.name("q"));
if(search.isDisplayed()&&search.isEnabled())
{
	search.sendKeys("india");
}
	}

}
