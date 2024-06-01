package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Medplusautosuggetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.medplusmart.com/");
		 WebElement search=driver.findElement(By.xpath("//input[@class='searchProduct']"));
		 search.sendKeys("coughsils");
	}

}
