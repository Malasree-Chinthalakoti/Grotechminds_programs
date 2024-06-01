package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_r_jsam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MADHUMALA/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
	WebElement un=	driver.findElement(By.xpath("(//input)[1]"));
	un.sendKeys("Malasree@gmail.com");
	WebElement h=	driver.findElement(By.xpath("(//input)[2]"));
	h.sendKeys("Mala");
	WebElement p=	driver.findElement(By.xpath("(//input)[3]"));
	p.sendKeys("Mala123");
	WebElement fn=	driver.findElement(By.xpath("(//input)[4]"));
	fn.sendKeys("Mala");
	WebElement by=	driver.findElement(By.xpath("(//input)[7]"));
	by.click();
	WebElement g=	driver.findElement(By.xpath("(//input)[8]"));
	g.click();
	WebElement c=	driver.findElement(By.xpath("(//input)[9]"));
	c.click();
	WebElement m=	driver.findElement(By.xpath("(//input)[11]"));
	m.click();
	WebElement f=	driver.findElement(By.xpath("(//input)[12]"));
	f.click();
	
	}

}
