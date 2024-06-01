package Selenium_launch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Postmandragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.xpath("(//div[@id='container'])[7]"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
		
		
		Actions a=new Actions(driver);
		a.dragAndDrop(drag,drop).perform();
		a.dragAndDrop(drop,drag).perform();
	}

}
