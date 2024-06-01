package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotechdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		WebElement demo1=driver.findElement(By.id("Choice1"));
		Select s1=new Select(demo1);
		s1.selectByVisibleText("Demo2");
		WebElement sql15=driver.findElement(By.id("Choice9"));
		Select s2=new Select(sql15);
		s2.selectByValue("SQL15");
		WebElement Night10=driver.findElement(By.id("Choice6"));
		Select s3=new Select(Night10);
		s3.selectByIndex(10);
		WebElement Energy15=driver.findElement(By.id("Choice4"));
		Select s4=new Select(Energy15);
		s4.selectByVisibleText("Energy15");
		WebElement qtp10=driver.findElement(By.id("Choice8"));
		Select s5=new Select(qtp10);
		s4.selectByVisibleText("QTP10");
		
	}

}
