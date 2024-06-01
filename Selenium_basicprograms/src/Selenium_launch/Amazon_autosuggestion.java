package Selenium_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com");
WebElement search=driver.findElement(By.name("q"));
search.sendKeys("india");
Thread.sleep(2000);
List<WebElement>    autosuggetion= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	int count=autosuggetion.size();
	System.out.println(count);
	autosuggetion.get(count-2).click();
	
	
	}

}

