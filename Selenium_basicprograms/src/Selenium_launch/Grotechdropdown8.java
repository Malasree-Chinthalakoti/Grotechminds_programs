package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotechdropdown8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		WebElement QTP6=driver.findElement(By.id("Choice8"));
		Select s1=new Select(QTP6);
		s1.selectByVisibleText("QTP6");
		WebElement Energy11=driver.findElement(By.id("Choice4"));
		Select s2=new Select(Energy11);
		s2.selectByVisibleText("Energy11");
	}

}
