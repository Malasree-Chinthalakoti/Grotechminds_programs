package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.name("reg_email__"));
		un.sendKeys("malasrirekha@gmail.com");
		WebElement up=driver.findElement(By.name("reg_passwd__"));
		up.sendKeys("malasri745");
		WebElement fn=driver.findElement(By.name("firstname"));
		fn.sendKeys("mala");
		WebElement ln=driver.findElement(By.name("lastname"));
		ln.sendKeys("sri");
		WebElement gn=driver.findElement(By.tagName("label"));
		gn.click();
		WebElement submit=driver.findElement(By.name("websubmit"));
		submit.click();
	}

}
