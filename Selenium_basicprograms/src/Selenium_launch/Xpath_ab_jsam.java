package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ab_jsam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/MADHUMALA/Downloads/learningHTML1.html");
driver.manage().window().maximize();
WebElement un=driver.findElement(By.xpath("(/html/body/input)[1]"));
un.sendKeys("malasree@gmail.com");
WebElement h=driver.findElement(By.xpath("(/html/body/input)[2]"));
h.sendKeys("mala123");

WebElement p=driver.findElement(By.xpath("(/html/body/input)[3]"));
p.sendKeys("mala111");
WebElement fn=driver.findElement(By.xpath("(/html/body/form/input)[1]"));
fn.sendKeys("mala");
WebElement by=driver.findElement(By.xpath("(/html/body/form/input)[4]"));
by.click();
WebElement g=driver.findElement(By.xpath("(/html/body/form/input)[5]"));
g.click();
WebElement c=driver.findElement(By.xpath("(/html/body/form/input)[6]"));
c.click();
WebElement m=driver.findElement(By.xpath("(/html/body/input)[4]"));
m.click();
WebElement f=driver.findElement(By.xpath("(/html/body/input)[5]"));
f.click();

	}

}
