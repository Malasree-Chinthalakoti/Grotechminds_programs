package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotechhoverover2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		WebElement demo4=driver.findElement(By.xpath("(//div[@class='popup6'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(demo4).perform();
		Thread.sleep(5000);
		//WebElement click=driver.findElement(By.xpath("//div[@class='popup4'][3]"));
		//click.click();
	}

}
