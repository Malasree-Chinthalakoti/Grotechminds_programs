package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gotechselected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MADHUMALA/Downloads/learningHTML1.html");
		WebElement boy=driver.findElement(By.name("name1"));
		boolean b1=boy.isSelected();
		if(b1==true)
		{
			System.out.println("boyselected");
		}
		else
		{
			System.out.println("boy not selected");
		}
		boy.click();
		System.out.println("boy now selected");
	}

}
