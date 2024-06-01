package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		WebElement day=driver.findElement(By.id("day"));
		Select s1=new Select(day);
		s1.selectByIndex(21);
		WebElement month=driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByValue("8");
		WebElement year=driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByVisibleText("2000");
	}

}
