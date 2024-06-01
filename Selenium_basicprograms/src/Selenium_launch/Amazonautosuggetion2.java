package Selenium_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonautosuggetion2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in");
WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
search.sendKeys("shoe");
Thread.sleep(2000);
List<WebElement>   autosuggetion= driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div"));
	int count=autosuggetion.size();
	System.out.println(count);
	autosuggetion.get(4).click();
	
	}

}
