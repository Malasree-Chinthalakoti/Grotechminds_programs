package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazondropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		
		
		Select s1=new Select(dropdown);
       // s1.selectByIndex(4);
	//s1.selectByValue("search-alias=dvd");
	//s1.selectByVisibleText("Pet Supplies");
	//s1.selectByIndex(1);
	//s1.selectByValue("search-alias=computers");
	//s1.selectByVisibleText("Car & Motorbike");
	//s1.selectByIndex(2);
	s1.selectByValue("search-alias=baby");
	//s1.selectByVisibleText("Books");
}
}
